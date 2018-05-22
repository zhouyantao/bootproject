package me.xiaoqian.bootproject.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class NewAirport {
	@Id
	@GeneratedValue
	private Long id;
	private String airportCode;
	private String airportName;
	private String cityName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
