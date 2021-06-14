package com.imc.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imc.crm.model.imc;

@RestController
@RequestMapping("/imc")
public class controller {
	
	@GetMapping
	public String listar(@RequestBody imc imcc) {
		new imc (imcc.getPeso(),imcc.getAltura());
		return imcc.retornar();
	}
}
