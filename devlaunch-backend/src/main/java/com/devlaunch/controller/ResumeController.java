package com.devlaunch.controller;


import com.devlaunch.dto.request.ResumeRequest;
import com.devlaunch.dto.response.ResumeResponse;
import com.devlaunch.service.ResumeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumes")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;
    @PostMapping
    public ResponseEntity<ResumeResponse> createResume(
            @Valid @RequestBody ResumeRequest request) {

        ResumeResponse response =
                resumeService.createResume(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<ResumeResponse>> getMyResumes() {

        return ResponseEntity.ok(
                resumeService.getMyResumes()
        );
    }

    @GetMapping("/{resumeId}")
    public ResponseEntity<ResumeResponse> getResume(
            @PathVariable Long resumeId) {

        return ResponseEntity.ok(
                resumeService.getResume(resumeId)
        );
    }

    @PutMapping("/{resumeId}")
    public ResponseEntity<ResumeResponse> updateResume(
            @PathVariable Long resumeId,

            @Valid
            @RequestBody ResumeRequest request) {

        return ResponseEntity.ok(
                resumeService.updateResume(
                        resumeId,
                        request
                )
        );
    }


    @DeleteMapping("/{resumeId}")
    public ResponseEntity<Void> deleteResume(
            @PathVariable Long resumeId) {

        resumeService.deleteResume(resumeId);

        return ResponseEntity.noContent().build();
    }


}