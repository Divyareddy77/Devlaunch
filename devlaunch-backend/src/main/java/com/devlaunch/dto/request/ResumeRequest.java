package com.devlaunch.dto.request;

import com.devlaunch.entity.enums.ResumeTemplate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResumeRequest {

    @NotBlank(message = "Title must not be blank")
    private String title;

    @NotBlank(message = "Summary must not be blank")
    private String summary;

    @NotNull(message = "Template is required")
    private ResumeTemplate templateName;
}
