package com.example.hdgttserver.repositories;

import com.example.hdgttserver.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusesRepository extends JpaRepository<Status, Integer> {
}
