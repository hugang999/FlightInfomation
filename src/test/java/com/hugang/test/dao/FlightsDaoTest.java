package com.hugang.test.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hugang.dao.FlightsDao;
import com.hugang.entity.Flights;
import com.hugang.test.BaseTest;

public class FlightsDaoTest extends BaseTest{

	@Autowired
	private FlightsDao flightsDao;
	
	@Test
	public void testQueryByCondition() throws Exception{
		String flight_date = "2019-5-17";
		String tak_airport_name = "北京";
		String landing_airport_name = "吉隆坡";
		
		List<Flights> list = flightsDao.queryByCondition(flight_date, tak_airport_name, landing_airport_name);
		
		System.err.println(list.size());
		Flights flights = list.get(0);
		System.err.println(flights);
	}
}
