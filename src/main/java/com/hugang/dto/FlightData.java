package com.hugang.dto;

import com.hugang.entity.Flights;

/**
 * 完整的航班信息类，跟flights的区别在于：flights里面的起飞和降落机场是id，这里是机场名称
 * 
 * @author
 *
 */
public class FlightData {

	private Flights flights;

	private String tak_airport_name;

	private String landing_airport_name;

	public Flights getFlights() {
		return flights;
	}

	public void setFlights(Flights flights) {
		this.flights = flights;
	}

	public String getTak_airport_name() {
		return tak_airport_name;
	}

	public void setTak_airport_name(String tak_airport_name) {
		this.tak_airport_name = tak_airport_name;
	}

	public String getLanding_airport_name() {
		return landing_airport_name;
	}

	public void setLanding_airport_name(String landing_airport_name) {
		this.landing_airport_name = landing_airport_name;
	}

	public FlightData(Flights flights, String tak_airport_name, String landing_airport_name) {
		super();
		this.flights = flights;
		this.tak_airport_name = tak_airport_name;
		this.landing_airport_name = landing_airport_name;
	}

	public FlightData() {
		super();
	}

}
