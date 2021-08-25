package com.oquerevalu.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.oquerevalu.model.Measurement;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeasurementRepositoryTest{
	
	@Autowired
	private MeasurementRepository measurementRepository; 
	
	@Test
	public void whenCreateMeasurement_thenCorrect() {
		Measurement measurement = new Measurement();
		measurement.setCold_water_measumement(100.0);
		measurement.setHot_water_measumement(100.0);
		measurement.setGas_measumement(100.0);
		measurement.setUserId("1");
        assertThat(measurementRepository.save(measurement)).isInstanceOf(Measurement.class);
	}
	
	@Test
	public void whenFindbyUserId_thenCorrect() {
		Measurement measurement = new Measurement();
		measurement.setCold_water_measumement(100.0);
		measurement.setHot_water_measumement(100.0);
		measurement.setGas_measumement(100.0);
		measurement.setUserId("1");
		measurementRepository.save(measurement);
        assertThat(measurementRepository.findByUserId("1")).isInstanceOf(List.class);
	}
	
}
