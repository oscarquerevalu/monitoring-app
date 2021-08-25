package com.oquerevalu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oquerevalu.conf.ValidationError;
import com.oquerevalu.conf.ValidationErrorBuilder;
import com.oquerevalu.model.Measurement;
import com.oquerevalu.service.MeasurementService;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {
	
	@Autowired
	private MeasurementService measurementService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
    public Measurement createMeasurement(@RequestBody @Valid final Measurement measurement) {
        return measurementService.save(measurement);
    }
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public List<Measurement> getMeasurement(@PathVariable String userId) {
        return measurementService.findByUserId(userId);
    }
	
	@ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ValidationError handleException(MethodArgumentNotValidException exception) {
        return createValidationError(exception);
    }

    private ValidationError createValidationError(MethodArgumentNotValidException e) {
        return ValidationErrorBuilder.fromBindingErrors(e.getBindingResult());
    }

}
