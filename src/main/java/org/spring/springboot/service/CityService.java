package org.spring.springboot.service;

import org.spring.springboot.domain.City;

public interface CityService {

	City findCityByName(String cityName);
}
