package com.example.hdgttserver.dtos.responses;


import com.example.hdgttserver.models.Comment;
import com.example.hdgttserver.models.Status;
import com.example.hdgttserver.models.User;
import com.example.hdgttserver.models.WorkPeriod;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class WorkTaskDto {
    private Integer id;
    private String name;
    private String description;
    private LocalDate deadline;
    private String statusName;
    private List<CommentDto> comments;
    private List<WorkPeriodDto> workPeriods;
}
