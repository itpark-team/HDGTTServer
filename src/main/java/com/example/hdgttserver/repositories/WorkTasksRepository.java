package com.example.hdgttserver.repositories;

import com.example.hdgttserver.models.WorkTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkTasksRepository extends JpaRepository<WorkTask, Integer> {
    List<WorkTask> findAllByUserId(Integer userId);
}
