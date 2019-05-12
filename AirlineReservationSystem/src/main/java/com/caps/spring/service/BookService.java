package com.caps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caps.spring.beans.BookDTO;
import com.caps.spring.dao.BookDAO;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookdao;
	
	
	public boolean book(BookDTO bookdto) {
		return bookdao.book(bookdto);
		
	}
	public boolean deletebooking(int bookingId) {
		return bookdao.deletebooking(bookingId);
		
	}
	public BookDTO searchBookingId(String bookingId) {
		return bookdao.searchBookingId(bookingId);
		
	}
//	List<BookDTO> listofbooking(){
//		return bookdao.searchBookingId();
//		
//	}
	

}
