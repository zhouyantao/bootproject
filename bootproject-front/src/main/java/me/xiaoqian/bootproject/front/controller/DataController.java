package me.xiaoqian.bootproject.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.xiaoqian.bootproject.dao.entity.NewAirport;
import me.xiaoqian.bootproject.dao.entity.NewAirportRepository;

@RestController
public class DataController {

	@Autowired
	NewAirportRepository newAirportRepository;
	
	@RequestMapping("/save")
    public NewAirport save(String name,String address,Integer age) {
		NewAirport airPort = new NewAirport();
		airPort.setAirportCode("CKG");
		airPort.setAirportName("江北机场");
		airPort.setCityName("重庆");
		NewAirport airPortPersisted = newAirportRepository.save(airPort);
        return airPortPersisted;
    }
	@RequestMapping("/search")
	public NewAirport searchAirport(String airportCode) {
		return newAirportRepository.findByAirportCode(airportCode);
	}
	
}
