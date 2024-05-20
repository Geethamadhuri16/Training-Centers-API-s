package com.example.traini8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.traini8.model.TrainingCenter;
import com.example.traini8.service.TrainingCenterService;

import jakarta.validation.Valid;

@RestController

@Validated
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping("/traini8")
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter createdTrainingCenter = service.createTrainingCenter(trainingCenter);
        return ResponseEntity.ok(createdTrainingCenter);
    }

    @GetMapping("/traini8")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = service.getAllTrainingCenters();
        return ResponseEntity.ok(trainingCenters);
    }
}
