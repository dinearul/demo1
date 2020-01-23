package com.arul.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private SampleRepository repository;
    

    public List<SampleEntity> getAllNames() {

        return repository.findAll();
    }

    public List<SampleEntity> getByNames(String name) {

        return repository.findBysName(name);
    }
    public SampleEntity getByName(String name) {

        return repository.findTopBysName(name);
    }

}