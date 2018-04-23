package org.cities.microservice.repository;

import org.cities.microservice.domain.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {

}