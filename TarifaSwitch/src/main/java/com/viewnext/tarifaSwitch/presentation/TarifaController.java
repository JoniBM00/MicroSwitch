package com.viewnext.tarifaSwitch.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.tarifaSwitch.business.TarifaService;
import com.viewnext.tarifaSwitch.repository.model.Tarifa;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/tarifa")
public class TarifaController {

	private TarifaService tarifaService;

	@Autowired
	public TarifaController(TarifaService tarifaService) {
		this.tarifaService = tarifaService;
	}

	@Autowired
	private Environment env;

	// Para poder sacar el puerto actual
	@Value("${server.port}")
	private Integer port;

	@GetMapping("/getAll")
	public ResponseEntity<List<Tarifa>> getAll() {
		List<Tarifa> lTarifa = tarifaService.findAll();
		for (Tarifa tarifa : lTarifa) {
			tarifa.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		}
		return ResponseEntity.ok(lTarifa);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Tarifa> getTarifa(@PathVariable Long id) {
		return ResponseEntity.ok(tarifaService.findById(id));
	}

}
