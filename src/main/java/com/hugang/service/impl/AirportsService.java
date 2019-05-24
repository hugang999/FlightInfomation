package com.hugang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hugang.dao.AirportsDao;
import com.hugang.entity.Airports;
import com.hugang.service.IAirportsService;

@Service
public class AirportsService implements IAirportsService{
	
	@Autowired
	AirportsDao airportsDao;

	@Override
	@Transactional(readOnly = true)
	public Airports queryAirportsById(String id) {
		
		return airportsDao.queryAirportsById(id);
	}

}
