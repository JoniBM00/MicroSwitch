package com.viewnext.catalogoSwitch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CatalogoSwitchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoSwitchApplication.class, args);
	}

}
