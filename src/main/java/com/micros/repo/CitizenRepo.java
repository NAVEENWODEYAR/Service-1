package com.micros.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.micros.modal.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>
{
	// findByName.,
	public Citizen findBycName(String name);
	
	@Query(value = "SELECT * FROM citizen_table WHERE citizen.cName=",nativeQuery = true)
	public void getSeniorCitizens();
}
