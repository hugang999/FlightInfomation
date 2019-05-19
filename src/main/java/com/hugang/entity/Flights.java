package com.hugang.entity;

/**
 * 航班信息实体类
 * 
 * @author
 *
 */
public class Flights {// 范德萨啊 是的

	private int id;// 航班信息id

	private String light_code;// 航班编号

	private String flight_date;// 航班日期

	private String airline;// 所属航空公司

	private String type;// 机型

	private int tak_airport_id;// 起飞机场 id

	private int landing_airport_id;// 降落机场 id

	private String take_time;// 起飞时间

	private String landing_time;// 降落时间

	private String flight_time;// 飞行时长

	private String stop_airport;// 经停机场

	private double reference_pric;// 参考报价

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLight_code() {
		return light_code;
	}

	public void setLight_code(String light_code) {
		this.light_code = light_code;
	}

	public String getFlight_date() {
		return flight_date;
	}

	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTak_airport_id() {
		return tak_airport_id;
	}

	public void setTak_airport_id(int tak_airport_id) {
		this.tak_airport_id = tak_airport_id;
	}

	public int getLanding_airport_id() {
		return landing_airport_id;
	}

	public void setLanding_airport_id(int landing_airport_id) {
		this.landing_airport_id = landing_airport_id;
	}

	public String getTake_time() {
		return take_time;
	}

	public void setTake_time(String take_time) {
		this.take_time = take_time;
	}

	public String getLanding_time() {
		return landing_time;
	}

	public void setLanding_time(String landing_time) {
		this.landing_time = landing_time;
	}

	public String getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}

	public String getStop_airport() {
		return stop_airport;
	}

	public void setStop_airport(String stop_airport) {
		this.stop_airport = stop_airport;
	}

	public double getReference_pric() {
		return reference_pric;
	}

	public void setReference_pric(double reference_pric) {
		this.reference_pric = reference_pric;
	}

	
	
}
