package com.hugang.dao;

import java.util.List;

import com.hugang.entity.Flight_tickets;

public interface Flight_ticketsDao {

	/**
	 * 通过航班信息id查询机票信息
	 * 
	 * @param id
	 * @return
	 */
	public List<Flight_tickets> queryFlight_ticketsById(String flightId);
}
