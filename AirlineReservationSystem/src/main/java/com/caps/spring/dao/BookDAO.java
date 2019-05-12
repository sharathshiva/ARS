package com.caps.spring.dao;

import java.util.List;

import com.caps.spring.beans.BookDTO;

public interface BookDAO {

	public boolean book(BookDTO bookdto);
	public boolean deletebooking(int bookingId);
	public BookDTO searchBookingId(String bookingId);
	List<BookDTO> listofbooking();

}
