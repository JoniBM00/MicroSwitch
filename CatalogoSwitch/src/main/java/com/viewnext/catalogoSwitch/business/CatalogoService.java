package com.viewnext.catalogoSwitch.business;

import java.util.List;

import com.viewnext.catalogoSwitch.repository.model.Catalogo;

public interface CatalogoService {

	public List<Catalogo> findAll();

	public Catalogo findById(Long id);

}
