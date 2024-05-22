package com.viewnext.catalogoSwitch.business.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.catalogoSwitch.business.CatalogoService;
import com.viewnext.catalogoSwitch.repository.CatalogoRepository;
import com.viewnext.catalogoSwitch.repository.model.Catalogo;

@Service
public class CatalogoServiceImpl implements CatalogoService {

	private final CatalogoRepository catalogoRepository;

	@Autowired
	public CatalogoServiceImpl(CatalogoRepository catalogoRepository) {
		this.catalogoRepository = catalogoRepository;
	}

	@Override
	public List<Catalogo> findAll() {
		return catalogoRepository.findAll();
	}

	@Override
	public Catalogo findById(Long id) {
		return catalogoRepository.findById(id).get();
	}

}
