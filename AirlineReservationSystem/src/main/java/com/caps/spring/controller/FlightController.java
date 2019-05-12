package com.caps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.caps.spring.beans.FlightDTO;
import com.caps.spring.service.FlightService;


@Controller
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	private FlightService flightService;

	
	@RequestMapping(value="/updateflight",method=RequestMethod.POST)
	public ModelAndView  updateHotel(@ModelAttribute FlightDTO flightdto ) {


		boolean result=flightService.updateflight(flightdto);

		if(result)
		{
			return new ModelAndView("AdminHomePage");
		}
		else
		{
			return new ModelAndView("UpdateFlight");
		}

	}
	
	@RequestMapping(value="/deletehotel",method=RequestMethod.GET)
	public ModelAndView  deleteHotel(@RequestParam("") String flightno) {


		boolean result=flightService.deleteFlight(flightno);

		if(result)
		{
			return new ModelAndView("AdminHomePage");
		}
		else
		{
			return new ModelAndView("DeleteFlight");
		}

	}
	
	@RequestMapping(value="/searchhotel",method=RequestMethod.POST)
	public ModelAndView  searchHotel(@RequestParam("") String flightno) {
		
		FlightDTO flightdto=flightService.searchFlight(flightno);

		if(flightdto!=null)
		{
			return new ModelAndView("FlightDetails");
		}
		else
		{
			return new ModelAndView("SearchFlight");
		}

	}

}
