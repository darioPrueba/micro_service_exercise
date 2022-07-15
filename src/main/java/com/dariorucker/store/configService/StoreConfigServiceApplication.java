package com.dariorucker.store.configService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StoreConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreConfigServiceApplication.class, args);
	}

}
