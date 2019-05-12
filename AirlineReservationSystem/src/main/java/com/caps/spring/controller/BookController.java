package com.caps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.caps.spring.beans.BookDTO;
import com.caps.spring.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/deletebook",method=RequestMethod.GET)
	public ModelAndView  deleteFlight(@RequestParam("") int bookingId) {


		boolean result=bookService.deletebooking(bookingId);

		if(result)
		{
			return new ModelAndView("AdminHomePage");
		}
		else
		{
			return new ModelAndView("DeleteBooking");
		}

	}
	
	@RequestMapping(value="/searchhotel",method=RequestMethod.POST)
	public ModelAndView  searchHotel(@RequestParam("") String bookingId) {
		
		
		BookDTO bookdto=bookService.searchBookingId(bookingId);

		if(bookdto!=null)
		{
			return new ModelAndView("BookDetails");
		}
		else
		{
			return new ModelAndView("SearchBook");
		}

	}
	
	@RequestMapping(value="/book",method=RequestMethod.POST)
	public ModelAndView  booking(@ModelAttribute BookDTO bookdto) {


		boolean result=bookService.book(bookdto);

		if(result)
		{
			System.out.println(bookdto);
			return new ModelAndView("BookingSucess");

		}
		else
		{
			return new ModelAndView("Booking");
		}

	}


}
