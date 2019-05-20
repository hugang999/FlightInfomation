package com.hugang.service;

import java.util.List;

import com.hugang.entity.Flights;

public interface IFlightsService {

	/**
	 * 通过航班时间、起飞机场、到达机场查询航班信息
	 * 
	 * @param flight_date
	 * @param tak_airport_name
	 * @param landing_airport_name
	 * @return
	 */
	public List<Flights> queryByCondition(String flight_date, String tak_airport_name, String landing_airport_name);
}
