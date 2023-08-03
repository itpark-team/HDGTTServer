package com.example.hdgttserver.controllers;

import com.example.hdgttserver.dtos.responses.WorkTasksByUserIdDto;
import com.example.hdgttserver.services.WorkTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("work-tasks")
@RequiredArgsConstructor
public class WorkTasksController {
    private final WorkTasksService workTasksService;

    @GetMapping("/get-all-by-userid/{userId}")
    public List<WorkTasksByUserIdDto> getAllByUserId(@PathVariable Integer userId) {
        return workTasksService.getAllByUserId(userId);
    }
}
