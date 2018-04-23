package org.cities.microservice.controller;

import java.util.List;

import org.cities.microservice.domain.City;
import org.cities.microservice.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping("/cities")
	@ResponseBody
	public ResponseEntity<List<City>> helloWorld() {
		List<City> cities = cityService.getAllCities();
		return new ResponseEntity<>(cities, HttpStatus.OK);
	}

}