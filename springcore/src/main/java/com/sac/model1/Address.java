package com.sac.model1;

public class Address {

	private int hno;
	private String streetname;
	private String city;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String streetname, String city, String country) {
		super();
		this.hno = hno;
		this.streetname = streetname;
		this.city = city;
		this.country = country;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", streetname=" + streetname + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
