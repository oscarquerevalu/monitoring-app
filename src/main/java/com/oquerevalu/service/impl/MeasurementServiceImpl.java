package com.oquerevalu.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oquerevalu.model.Measurement;
import com.oquerevalu.repository.MeasurementRepository;
import com.oquerevalu.service.MeasurementService;

@Service
public class MeasurementServiceImpl implements MeasurementService {

	@Autowired
	private MeasurementRepository measurementRepository;
	
	@Transactional
	public Measurement save(Measurement measurement) {
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		measurement.setDate_measumement(dateFormat.format(date));
		return measurementRepository.save(measurement);
	}

	@Override
	public List<Measurement> findByUserId(String userId) {
		return (List<Measurement>) measurementRepository.findByUserId(userId);
	}
	
	

}
