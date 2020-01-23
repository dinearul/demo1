package com.arul.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    SampleService service;
    @Autowired
    DemoService demoService;

    

    @GetMapping(value = "/names")
    public List<SampleEntity> getAllnames() {
        return service.getAllNames();
    }

    @GetMapping(value = "/finds")
    public List<SampleEntity> findByNames(@RequestParam String name) {
        return service.getByNames(name);
    }
    @GetMapping(value = "/find")
    public SampleEntity findByName(@RequestParam String name) {
        return service.getByName(name);
    }
    @GetMapping(value = "/findAll")
    public Object findAllName() {
        return demoService.getNames();
    }
}
