package com.hugang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugang.dao.AirportsDao;
import com.hugang.entity.Airports;
import com.hugang.service.IAirportsService;

@Service
public class AirportsService implements IAirportsService{
	
	@Autowired
	AirportsDao airportsDao;

	@Override
	public Airports queryAirportsById(String id) {
		
		return airportsDao.queryAirportsById(id);
	}

}
