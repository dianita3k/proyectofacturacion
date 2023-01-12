/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.repository;

import com.example.ProyectoFactura.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author LENOVO
 */
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

    @Query(value = "Select * from cliente c where c.cedula = :cedula", nativeQuery = true)
    public Cliente buscarCliente(String cedula);
}
