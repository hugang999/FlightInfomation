package com.hugang.dao;

import com.hugang.entity.Airports;

public interface AirportsDao {

	/**
	 * 通过id查询机场信息
	 * 
	 * @param id
	 * @return
	 */
	public Airports queryAirportsById(String id);
}
