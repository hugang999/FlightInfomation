package com.hugang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hugang.dto.FlightData;
import com.hugang.dto.Result;
import com.hugang.entity.Airports;
import com.hugang.entity.Flights;
import com.hugang.service.IAirportsService;
import com.hugang.service.IFlight_ticketsService;
import com.hugang.service.IFlightsService;
import com.hugang.utils.CommonFunc;

@Controller
@RequestMapping(value="/flights")
public class FlightsController {

	@Autowired
	IFlightsService flightsService;
	
	@Autowired
	IAirportsService airportsService;
	
	@Autowired
	IFlight_ticketsService flight_ticketsService;
	
	@RequestMapping(method=RequestMethod.GET, value="/queryByCondition")
	//
	public String queryByCondition(@RequestParam String flight_date, @RequestParam String tak_airport_name, @RequestParam String landing_airport_name, Model model) {
		//定义传到前台页面的数据
		List<FlightData> flightDatas = new ArrayList<FlightData>();
		Map<String, String> map = new HashMap();
		map.put("flight_date", flight_date);
		map.put("tak_airport_name", tak_airport_name);
		map.put("landing_airport_name", landing_airport_name);

		//根据条件先查出航班信息
		List<Flights> flights = flightsService.queryByCondition(CommonFunc.toString(map.get("flight_date")), CommonFunc.toString(map.get("tak_airport_name")), CommonFunc.toString(map.get("landing_airport_name")));
		//根据查出的航班信息，查询起飞和降落机场信息
		for (Flights flight : flights) {
			flight.setTake_time(flight.getTake_time().split(" ")[1]);
			flight.setLanding_time(flight.getLanding_time().split(" ")[1]);
			Airports airports = airportsService.queryAirportsById(CommonFunc.toString(flight.getTak_airport_id()));
			String tak_airport_name1 = airports.getAirport_name();
			airports = airportsService.queryAirportsById(CommonFunc.toString(flight.getLanding_airport_id()));
			String landing_airport_name1 = airports.getAirport_name();
			flightDatas.add(new FlightData(flight, tak_airport_name1, landing_airport_name1));
		}
		model.addAttribute("flightDatas", flightDatas);
		model.addAttribute("flight_date", flight_date);
		model.addAttribute("tak_airport_name", tak_airport_name);
		model.addAttribute("landing_airport_name", landing_airport_name);
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}
}
