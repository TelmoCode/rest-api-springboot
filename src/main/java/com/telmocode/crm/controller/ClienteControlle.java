package com.telmocode.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telmocode.crm.model.Clientes;
import com.telmocode.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteControlle {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Clientes> listar() {
		
		return clienteRepository.findAll();
		
		
	}

}	
