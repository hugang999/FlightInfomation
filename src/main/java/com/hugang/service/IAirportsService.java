package com.hugang.service;

import com.hugang.entity.Airports;

public interface IAirportsService {

	/**
	 * 通过id查询机场信息
	 * 
	 * @param id
	 * @return
	 */
	public Airports queryAirportsById(String id);
}
