package com.viewnext.tarifaSwitch.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tarifa {

	@Id
	private Long id;
	private String nombre;
	private float precio;
	private int port;
}
