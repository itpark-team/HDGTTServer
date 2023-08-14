package com.example.hdgttserver.dtos.responses;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class WorkPeriodDto {
    private LocalDateTime startDatetime;
    private LocalDateTime finishDatetime;
}
