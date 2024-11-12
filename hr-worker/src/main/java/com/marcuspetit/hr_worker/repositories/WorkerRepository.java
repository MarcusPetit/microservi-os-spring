package com.marcuspetit.hr_worker.repositories;

import com.marcuspetit.hr_worker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}