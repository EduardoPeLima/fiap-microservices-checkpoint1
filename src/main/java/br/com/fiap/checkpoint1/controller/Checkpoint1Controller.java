package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Checkpoint1Controller {

	@Autowired
	Environment env;
	
	@GetMapping("/ping")
	public String ping() {
		return ("Pong em " + env.getActiveProfiles()[0]);
	}
	
}