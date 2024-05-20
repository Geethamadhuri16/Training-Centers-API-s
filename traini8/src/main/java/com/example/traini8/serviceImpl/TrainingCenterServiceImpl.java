package com.example.traini8.serviceImpl;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.traini8.model.TrainingCenter;
import com.example.traini8.repo.TrainingCenterRepository;
import com.example.traini8.service.TrainingCenterService;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {
	@Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(Instant.now().getEpochSecond());
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }

}
