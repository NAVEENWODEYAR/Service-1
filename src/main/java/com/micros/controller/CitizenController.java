package com.micros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micros.modal.Citizen;
import com.micros.service.CitizenService;

@RestController
@RequestMapping("/citizen")
public class CitizenController 
{
	@Autowired
	private CitizenService citizenService;
	
	
	// test endPoint.,
	@GetMapping("/test")
	private String test(String str)
	{	
		return "Hello Mr."+str+", welcome to the team";
	}
	
	// 1. get data,
	@GetMapping("/getCitizen")
	private List<Citizen> getCitizens()
	{
		List<Citizen> list = citizenService.getCitizens();
		return list;
	}
	
	// 2. send data.,
	@PostMapping("/addCitizen")
	private Citizen insertCitizen(@RequestBody Citizen citizen)
	{
		return citizenService.addCitizen(citizen);
	}
	
	// 3. getById.,
	@GetMapping("/findById")
	private Citizen getById(@PathVariable Integer id)
	{
		return citizenService.getCitizenById(id);
	}
}
