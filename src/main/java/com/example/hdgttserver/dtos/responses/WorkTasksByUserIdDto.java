package com.example.hdgttserver.dtos.responses;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
public class WorkTasksByUserIdDto {
    private Integer id;
    private String name;
    private String description;
    private LocalDate deadline;
    private String statusName;
}
