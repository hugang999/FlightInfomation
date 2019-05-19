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

}
