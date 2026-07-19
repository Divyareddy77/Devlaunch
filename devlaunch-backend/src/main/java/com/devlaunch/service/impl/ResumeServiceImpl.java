package com.devlaunch.service.impl;

import com.devlaunch.dto.request.ResumeRequest;
import com.devlaunch.dto.response.ResumeResponse;
import com.devlaunch.entity.Resume;
import com.devlaunch.entity.User;
import com.devlaunch.exception.DuplicateResourceException;
import com.devlaunch.exception.ResourceNotFoundException;
import com.devlaunch.mapper.ResumeMapper;
import com.devlaunch.repository.ResumeRepository;
import com.devlaunch.service.AuthenticationService;
import com.devlaunch.service.ResumeService;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ResumeServiceImpl implements ResumeService {


    private final ResumeRepository resumeRepository;


    private final AuthenticationService authenticationService;
    @Override
    public ResumeResponse createResume(ResumeRequest request) {

        User user = authenticationService.getCurrentUser();

        if (resumeRepository.existsByTitleAndUserId(
                request.getTitle(), user.getId())) {
            throw new DuplicateResourceException(
                    "Resume title already exists");
        }

        Resume resume = Resume.builder()
                .title(request.getTitle())
                .summary(request.getSummary())
                .templateName(request.getTemplateName())
                .user(user)
                .build();

        Resume savedResume = resumeRepository.save(resume);

        return ResumeMapper.toResponseDTO(savedResume);
    }

    @Override
    public List<ResumeResponse> getMyResumes() {

        User user = authenticationService.getCurrentUser();

        List<Resume> resumes =
                resumeRepository.findByUserId(user.getId());

        return resumes.stream()
                .map(ResumeMapper::toResponseDTO)
                .toList();
    }

    @Override
    public ResumeResponse getResume(Long resumeId) {

        User user = authenticationService.getCurrentUser();

        Resume resume = resumeRepository
                .findByIdAndUserId(resumeId, user.getId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Resume not found"));

        return ResumeMapper.toResponseDTO(resume);
    }

    @Override
    @Transactional
    public ResumeResponse updateResume(
            Long resumeId,
            ResumeRequest request) {

        User user = authenticationService.getCurrentUser();

        Resume resume = resumeRepository
                .findByIdAndUserId(resumeId, user.getId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Resume not found"));

        if (!resume.getTitle().equals(request.getTitle())
                && resumeRepository.existsByTitleAndUserId(
                request.getTitle(),
                user.getId())) {

            throw new DuplicateResourceException(
                    "Resume title already exists");
        }

        resume.setTitle(request.getTitle());
        resume.setSummary(request.getSummary());
        resume.setTemplateName(request.getTemplateName());

        Resume updatedResume = resumeRepository.save(resume);

        return ResumeMapper.toResponseDTO(updatedResume);
    }


    @Override
    @Transactional
    public void deleteResume(Long resumeId) {

        User user = authenticationService.getCurrentUser();

        Resume resume = resumeRepository
                .findByIdAndUserId(resumeId, user.getId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Resume not found"));

        resumeRepository.delete(resume);
    }
}