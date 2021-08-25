package com.oquerevalu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oquerevalu.model.Measurement;

@Service
public interface MeasurementService {
	
	Measurement save(Measurement measurement);
	
	List<Measurement> findByUserId(String userId);

}
