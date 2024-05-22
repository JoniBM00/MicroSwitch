package com.viewnext.catalogoSwitch.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.catalogoSwitch.business.CatalogoService;
import com.viewnext.catalogoSwitch.repository.model.Catalogo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

	private CatalogoService catalogoService;

	@Autowired
	public CatalogoController(CatalogoService catalogoService) {
		this.catalogoService = catalogoService;
	}

	@Value("${server.port}")
	private Integer port;

	@GetMapping("/getAll")
	public ResponseEntity<List<Catalogo>> getAll() {

		List<Catalogo> lCatalogo = catalogoService.findAll();
		return ResponseEntity.ok(lCatalogo);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Catalogo> getCatalogo(@PathVariable Long id) {
		return ResponseEntity.ok(catalogoService.findById(id));
	}

}
