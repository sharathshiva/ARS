package com.caps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caps.spring.beans.FlightDTO;
import com.caps.spring.dao.FlightDAO;

@Service
public class FlightService {
	
	@Autowired
	private FlightDAO flightdao;
	
	public boolean updateflight(FlightDTO flightdto) {
		return flightdao.updateflight(flightdto);
		
	}
	public boolean deleteFlight(String flightno) {
		return flightdao.deleteFlight(flightno);
		
	}
	public FlightDTO searchFlight(String flightno) {
		return flightdao.searchFlight(flightno);
		
	}
//	public List<FlightDTO> listOfFlights(){
//		return null;
//		
//	}

}
