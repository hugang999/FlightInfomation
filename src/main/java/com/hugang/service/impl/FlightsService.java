package com.hugang.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugang.dao.FlightsDao;
import com.hugang.entity.Flights;
import com.hugang.service.IFlightsService;

@Service
public class FlightsService implements IFlightsService{
	
	//日志
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FlightsDao flightsDao;

	@Override
	public List<Flights> queryByCondition(String flight_date, String tak_airport_name, String landing_airport_name) {
		return flightsDao.queryByCondition(flight_date, tak_airport_name, landing_airport_name);
	}

}
