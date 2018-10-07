package com.learning.house.houseservice.service;

import com.learning.house.houseservice.mapper.CityMapper;
import com.learning.house.houseservice.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
  
  @Autowired
  private CityMapper cityMapper;
  
  public List<City> getAllCitys(){
    City query = new City();
    return cityMapper.selectCitys(query);
  }

}
