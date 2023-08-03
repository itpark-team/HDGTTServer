package com.example.hdgttserver.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "work_periods")
public class WorkPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "start_datetime")
    private LocalDateTime startDatetime;

    @Column(name = "finish_datetime")
    private LocalDateTime finishDatetime;

    @Column(name = "duration")
    private Long duration;

    @ManyToOne
    @JoinColumn(name = "work_task_id")
    private WorkTask workTask;
}
