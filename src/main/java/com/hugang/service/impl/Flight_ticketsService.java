package com.hugang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugang.dao.Flight_ticketsDao;
import com.hugang.entity.Flight_tickets;
import com.hugang.service.IFlight_ticketsService;

@Service
public class Flight_ticketsService implements IFlight_ticketsService {

	@Autowired
	Flight_ticketsDao flight_ticketsDao;

	@Override
	public List<Flight_tickets> queryFlight_ticketsById(String flightId) {
		return flight_ticketsDao.queryFlight_ticketsById(flightId);
	}

}
