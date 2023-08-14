package com.example.hdgttserver.controllers;

import com.example.hdgttserver.dtos.responses.WorkTaskDto;
import com.example.hdgttserver.dtos.responses.WorkTasksByUserIdDto;
import com.example.hdgttserver.services.WorkTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("work-tasks")
@CrossOrigin
@RequiredArgsConstructor
public class WorkTasksController {
    private final WorkTasksService workTasksService;

    @GetMapping("/get-all-by-userid/{userId}")
    public List<WorkTasksByUserIdDto> getAllByUserId(@PathVariable Integer userId) {
        return workTasksService.getAllByUserId(userId);
    }

    @GetMapping("/get-by-id/{id}")
    public WorkTaskDto getByUserId(@PathVariable Integer id) {
        return workTasksService.getAllById(id);
    }
}
