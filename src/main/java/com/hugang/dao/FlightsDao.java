package com.hugang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hugang.entity.Flights;

public interface FlightsDao {

	/**
	 * 通过航班时间、起飞机场、到达机场查询航班信息
	 * 
	 * @param flight_date
	 * @param tak_airport_name
	 * @param landing_airport_name
	 * @return
	 */
	public List<Flights> queryByCondition(@Param("flight_date") String flight_date,
			@Param("tak_airport_name") String tak_airport_name,
			@Param("landing_airport_name") String landing_airport_name);
}
