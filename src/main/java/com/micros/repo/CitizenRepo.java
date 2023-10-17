package com.micros.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micros.modal.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>
{

}
