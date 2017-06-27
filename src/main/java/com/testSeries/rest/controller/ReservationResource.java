package com.testSeries.rest.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testSeries.helper.ResourceConstants;
import com.testSeries.rest.model.response.ReservationResponse;

@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {

	@RequestMapping(path="", produces= MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
	public ResponseEntity<ReservationResponse> getAvailableRooms(
			@RequestParam(value="checkin") 
			@DateTimeFormat(iso=ISO.DATE)
			LocalDate checkin
			,@RequestParam(value="checkout") 
			@DateTimeFormat(iso=ISO.DATE)
			LocalDate checkout){
		return new ResponseEntity<>(new ReservationResponse(),HttpStatus.OK);
	}
}
