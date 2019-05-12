package com.caps.spring.dao;

import java.util.List;

import com.caps.spring.beans.FlightDTO;


public interface FlightDAO {

	
	public boolean updateflight(FlightDTO flightdto);
	public boolean deleteFlight(String flightno);
	public FlightDTO searchFlight(String flightno);
	public List<FlightDTO> listOfFlights();
}
