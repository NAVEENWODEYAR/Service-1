package com.micros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.micros.modal.Citizen;
import com.micros.service.CitizenService;


@RestController
@RequestMapping("/citizen")
public class CitizenController 
{
	@Autowired
	private CitizenService citizenService;
	
	
	// Test endPoint.,
	@GetMapping("/test")
	private String test(String str)
	{	
		return "Hello Mr."+str+", welcome to the club";
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
