package com.viewnext.tarifaSwitch.business.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.tarifaSwitch.business.TarifaService;
import com.viewnext.tarifaSwitch.repository.TarifaRepository;
import com.viewnext.tarifaSwitch.repository.model.Tarifa;

@Service
public class TarifaServiceImpl implements TarifaService {

	private final TarifaRepository tarifaRepository;

	@Autowired
	public TarifaServiceImpl(TarifaRepository tarifaRepository) {
		this.tarifaRepository = tarifaRepository;
	}

	@Override
	public List<Tarifa> findAll() {
		return tarifaRepository.findAll();
	}

	@Override
	public Tarifa findById(Long id) {
		return tarifaRepository.findById(id).get();
	}

}
