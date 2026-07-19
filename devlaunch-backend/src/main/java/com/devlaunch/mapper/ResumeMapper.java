package com.devlaunch.mapper;

import com.devlaunch.dto.response.ResumeResponse;
import com.devlaunch.entity.Resume;

public class ResumeMapper {
    public static ResumeResponse toResponseDTO(Resume resume) {

        return ResumeResponse.builder()
                .id(resume.getId())
                .title(resume.getTitle())
                .summary(resume.getSummary())
                .templateName(resume.getTemplateName())
                .createdAt(resume.getCreatedAt())
                .updatedAt(resume.getUpdatedAt())
                .build();
    }
}
