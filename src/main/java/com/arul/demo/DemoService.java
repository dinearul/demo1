package com.arul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DemoService{

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Object getNames()
    {
        String query = "Select S_NAME from Sample_Entity";
        return jdbcTemplate.queryForList(query);

    }
}