package com.marcuspetit.hr_worker.resources;

import com.marcuspetit.hr_worker.entity.Worker;
import com.marcuspetit.hr_worker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/worker")
public class WorkerResource {
    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }

}
