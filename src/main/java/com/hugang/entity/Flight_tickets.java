package com.hugang.entity;

/**
 * 机票信息实体类
 * 
 * @author
 *
 */
public class Flight_tickets {

	private int id;// 机票信息id

	private int flight_id;// 航班id

	private String flight_date;// 航班时间

	private double ticket_price;// 票价

	private String sell_company;// 售票单位

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_date() {
		return flight_date;
	}

	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}

	public double getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}

	public String getSell_company() {
		return sell_company;
	}

	public void setSell_company(String sell_company) {
		this.sell_company = sell_company;
	}
	
	
}
