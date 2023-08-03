package com.example.hdgttserver.repositories;

import com.example.hdgttserver.models.WorkPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkPeriodsRepository extends JpaRepository<WorkPeriod, Integer> {
}
