package com.arul.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

   // @Query("select   s.sName from  SampleEntity s where s.sName=?1")
    public List<SampleEntity> findBysName(String name);
    public SampleEntity findTopBysName(String name);
}