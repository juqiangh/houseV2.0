package com.learning.house.houseservice.mapper;

import com.learning.house.houseservice.model.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
  
  public List<City> selectCitys(City city);

}
