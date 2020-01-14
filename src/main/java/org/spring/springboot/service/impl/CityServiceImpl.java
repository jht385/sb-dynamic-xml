package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityMapper;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	public City findCityByName(String cityName) {
		return cityMapper.findByName(cityName);
	}

}
