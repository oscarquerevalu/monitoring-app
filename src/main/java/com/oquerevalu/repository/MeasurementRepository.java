package com.oquerevalu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oquerevalu.model.Measurement;

@Repository
public interface MeasurementRepository extends CrudRepository<Measurement, Long>{
	
	List<Measurement> findByUserId(String userId);
	
}
