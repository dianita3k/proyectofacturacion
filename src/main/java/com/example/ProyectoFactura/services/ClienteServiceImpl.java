/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.services;

import com.example.ProyectoFactura.model.Cliente;
import com.example.ProyectoFactura.repository.ClienteRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Integer> implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public CrudRepository<Cliente, Integer> getDao() {
        return clienteRepository; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Cliente buscarCliente(String cedula) {
        return clienteRepository.buscarCliente(cedula);
    }
    
    
    
}
