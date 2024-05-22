package com.viewnext.tarifaSwitch.business;

import java.util.List;

import com.viewnext.tarifaSwitch.repository.model.Tarifa;

public interface TarifaService {

	public List<Tarifa> findAll();

	public Tarifa findById(Long id);

}
