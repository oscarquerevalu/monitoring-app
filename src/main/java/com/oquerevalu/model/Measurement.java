package com.oquerevalu.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "measurement")
public class Measurement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull(message = "Gas measumement must not be null!")
	private Double gas_measumement;
	
	@NotNull(message = "Hot water measumement must not be null!")
	private Double hot_water_measumement;
	
	@NotNull(message = "Cold water measumement must not be null!")
	private Double cold_water_measumement;
	
	@NotNull(message = "User id must not be null!")
    private String userId;
	
	private String date_measumement;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getGas_measumement() {
		return gas_measumement;
	}
	public void setGas_measumement(Double gas_measumement) {
		this.gas_measumement = gas_measumement;
	}
	public Double getHot_water_measumement() {
		return hot_water_measumement;
	}
	public void setHot_water_measumement(Double hot_water_measumement) {
		this.hot_water_measumement = hot_water_measumement;
	}
	public Double getCold_water_measumement() {
		return cold_water_measumement;
	}
	public void setCold_water_measumement(Double cold_water_measumement) {
		this.cold_water_measumement = cold_water_measumement;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDate_measumement() {
		return date_measumement;
	}
	public void setDate_measumement(String date_measumement) {
		this.date_measumement = date_measumement;
	}

}
