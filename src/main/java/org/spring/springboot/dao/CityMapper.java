package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

public interface CityMapper {
	City findByName(@Param("cityName") String cityName);
}
