package com.viewnext.catalogoSwitch.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Catalogo {

	@Id
	private Long id;
	private String nombre;
	private String descripcion;

}
