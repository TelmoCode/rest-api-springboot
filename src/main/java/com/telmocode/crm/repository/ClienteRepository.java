package com.telmocode.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.telmocode.crm.model.Clientes;



@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {

	
	
}
