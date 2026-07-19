package com.devlaunch.dto.response;

import com.devlaunch.entity.enums.ResumeTemplate;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResumeResponse {

    private Long id;

    private String title;

    private String summary;

    private ResumeTemplate templateName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
