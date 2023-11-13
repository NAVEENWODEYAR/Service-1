package com.micros.modal;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Citizen_Table")
public class Citizen 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cID;
	
	@Column(name = "Citizen_Name")
	private String cName;
	
	@Column(name = "Center_ID")
	private int vaccinationCenterId;
}
