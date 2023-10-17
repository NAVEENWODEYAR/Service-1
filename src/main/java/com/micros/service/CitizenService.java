package com.micros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.micros.modal.Citizen;
import com.micros.repo.CitizenRepo;

@Service
public class CitizenService 
{
	// Constructor Dependency injection.,
	@Autowired
	private CitizenRepo citizenRepo;
	
	// CRUD Operations,
	// 1. INSERT INTO TABLE VALUES,
	public Citizen addCitizen(Citizen citizen)
	{
		return citizenRepo.save(citizen);
	}
	
	// 2. SELECT * FROM TABLE.,
	public List<Citizen> getCitizens()
	{
		List<Citizen> list = citizenRepo.findAll();
		return list;
	}
	
	// 3. findById
	public Citizen getCitizenById(@PathVariable Integer id)
	{
		return citizenRepo.findById(id).get();
	}
}
