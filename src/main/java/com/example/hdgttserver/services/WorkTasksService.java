package com.example.hdgttserver.services;

import com.example.hdgttserver.dtos.responses.WorkTaskDto;
import com.example.hdgttserver.dtos.responses.WorkTasksByUserIdDto;
import com.example.hdgttserver.models.WorkTask;
import com.example.hdgttserver.repositories.WorkTasksRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkTasksService {
    private final WorkTasksRepository workTasksRepository;
    private final ModelMapper modelMapper;

    public List<WorkTasksByUserIdDto> getAllByUserId(Integer userId) {
        return workTasksRepository.findAllByUserId(userId)
                .stream()
                .map(item -> modelMapper.map(item, WorkTasksByUserIdDto.class))
                .collect(Collectors.toList());
    }

    public WorkTaskDto getAllById(Integer id) {
        WorkTask workTask = workTasksRepository.findById(id).get();

        return modelMapper.map(workTask, WorkTaskDto.class);
    }
}
