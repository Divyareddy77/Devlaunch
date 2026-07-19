package com.devlaunch.service;

import com.devlaunch.dto.request.ResumeRequest;
import com.devlaunch.dto.response.ResumeResponse;

import java.util.List;

public interface ResumeService {
    ResumeResponse createResume(ResumeRequest request);

    ResumeResponse getResume(Long resumeId);

    List<ResumeResponse> getMyResumes();

    ResumeResponse updateResume(Long resumeId,
                                   ResumeRequest request);

    void deleteResume(Long resumeId);
}
