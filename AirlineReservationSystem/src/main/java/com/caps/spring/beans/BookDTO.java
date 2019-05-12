package com.caps.spring.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class BookDTO {
	
	@Id
	@Column(name="BookingId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	
	@Column(name="Flightno")
	private String flightNo;

	@Column(name="Email")
	private String email;

	@Column(name="Depcity")
	private String depCity;

	@Column(name="Arrcity")
	private String ArrCity;

	@Column(name="Depdate")
	private Date depDate;

	@Column(name="Retrundate")
	private Date returnDate;

	@Column(name="NoOfPassengers")
	private int noOfOpassengers;

	@Column(name="NoOfInfants")
	private int noOfInfants;

	@Column(name="Bseat")
	private int bussSeat;

	@Column(name="Cseat")
	private int classSeat;

	@Column(name="Amount")
	private double amount;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrCity() {
		return ArrCity;
	}

	public void setArrCity(String arrCity) {
		ArrCity = arrCity;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getNoOfOpassengers() {
		return noOfOpassengers;
	}

	public void setNoOfOpassengers(int noOfOpassengers) {
		this.noOfOpassengers = noOfOpassengers;
	}

	public int getNoOfInfants() {
		return noOfInfants;
	}

	public void setNoOfInfants(int noOfInfants) {
		this.noOfInfants = noOfInfants;
	}

	public int getBussSeat() {
		return bussSeat;
	}

	public void setBussSeat(int bussSeat) {
		this.bussSeat = bussSeat;
	}

	public int getClassSeat() {
		return classSeat;
	}

	public void setClassSeat(int classSeat) {
		this.classSeat = classSeat;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BookDTO [bookingId=" + bookingId + ", flightNo=" + flightNo + ", email=" + email + ", depCity="
				+ depCity + ", ArrCity=" + ArrCity + ", depDate=" + depDate + ", returnDate=" + returnDate
				+ ", noOfOpassengers=" + noOfOpassengers + ", noOfInfants=" + noOfInfants + ", bussSeat=" + bussSeat
				+ ", classSeat=" + classSeat + ", amount=" + amount + "]";
	}




}
