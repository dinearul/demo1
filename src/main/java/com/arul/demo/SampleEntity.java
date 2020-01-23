package com.arul.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class SampleEntity {

    @Id
    @GeneratedValue
    private Long sId;
    private String sName;

}