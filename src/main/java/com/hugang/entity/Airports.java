package com.hugang.entity;

/**
 * 机场实体类
 * 
 * @author
 *
 */
public class Airports {

	private int id; // 机场id

	private String airport_name;// 机场名称

	private String city_name;// 所属城市

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
	
}
