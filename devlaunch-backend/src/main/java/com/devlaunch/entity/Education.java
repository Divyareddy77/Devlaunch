package com.devlaunch.entity;

import com.devlaunch.entity.enums.GradeType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "educations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String institutionName;

    private String degree;

    private String fieldOfStudy;

    private String grade;

    @Enumerated(EnumType.STRING)
    private GradeType gradeType;

    private LocalDate startDate;

    private LocalDate endDate;

    @Column(length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resume_id", nullable = false)
    private Resume resume;
}