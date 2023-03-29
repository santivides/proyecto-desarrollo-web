package com.canchas_admin.administrador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.canchas_admin.model.Canchas;
import com.canchas_admin.model.CanchasRepository;

@SpringBootApplication 
public class AdministradorApplication{

	public static void main(String[] args) {
		SpringApplication.run(AdministradorApplication.class, args);
	}
}
