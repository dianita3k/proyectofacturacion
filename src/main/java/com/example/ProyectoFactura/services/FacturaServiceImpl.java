/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.services;

import com.example.ProyectoFactura.model.Factura;
import com.example.ProyectoFactura.repository.FacturaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class FacturaServiceImpl extends GenericServiceImpl<Factura, Integer> implements FacturaService{
    @Autowired
    FacturaRepository facturaRepository;
    
    @Override
    public CrudRepository<Factura, Integer> getDao() {
        return facturaRepository;
    }
    
}
