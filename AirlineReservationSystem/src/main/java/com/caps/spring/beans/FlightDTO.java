package com.caps.spring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flights")
public class FlightDTO {
	
	@Id
	@Column (name="FlightNo")
	private String flightno;
	
	@Column (name="Airline")
	private String airline;
	
	@Column (name="Depcity")
	private String depcity;
	
	@Column (name="Arrcity")
	private String arrcity;
	
	@Column (name="Depdate")
	private String ddat;
	
	@Column (name="Arrdate")
	private String adat;
	
	@Column (name="TotalNoOfSeat")
	private String tns;
	
	@Column (name="CSeat")
	private String cseat;
	
	@Column (name="BSeat")
	private String bseat;
	
	@Column (name="Amount")
	private String amount;

	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepcity() {
		return depcity;
	}

	public void setDepcity(String depcity) {
		this.depcity = depcity;
	}

	public String getArrcity() {
		return arrcity;
	}

	public void setArrcity(String arrcity) {
		this.arrcity = arrcity;
	}

	public String getDdat() {
		return ddat;
	}

	public void setDdat(String ddat) {
		this.ddat = ddat;
	}

	public String getAdat() {
		return adat;
	}

	public void setAdat(String adat) {
		this.adat = adat;
	}

	public String getTns() {
		return tns;
	}

	public void setTns(String tns) {
		this.tns = tns;
	}

	public String getCseat() {
		return cseat;
	}

	public void setCseat(String cseat) {
		this.cseat = cseat;
	}

	public String getBseat() {
		return bseat;
	}

	public void setBseat(String bseat) {
		this.bseat = bseat;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String string) {
		this.amount = string;
	}

	@Override
	public String toString() {
		return "FlightDTO [flightno=" + flightno + ", airline=" + airline + ", depcity=" + depcity + ", arrcity="
				+ arrcity + ", ddat=" + ddat + ", adat=" + adat + ", tns=" + tns + ", cseat=" + cseat + ", bseat="
				+ bseat + ", amount=" + amount + "]";
	}

	

}
