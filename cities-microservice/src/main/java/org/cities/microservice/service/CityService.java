package org.cities.microservice.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.cities.microservice.domain.City;
import org.cities.microservice.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public List<City> getAllCities(){
		List<City> result = StreamSupport
				.stream(cityRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		System.out.println(result);
		return result;
	}
}
