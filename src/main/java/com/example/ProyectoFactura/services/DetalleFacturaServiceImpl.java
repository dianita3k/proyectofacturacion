/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.services;

import com.example.ProyectoFactura.model.DetalleFactura;
import com.example.ProyectoFactura.repository.DetalleRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class DetalleFacturaServiceImpl extends GenericServiceImpl<DetalleFactura, Integer> implements DetalleFacturaService{
@Autowired
DetalleRepository detalleRepository;
    @Override
    public CrudRepository<DetalleFactura, Integer> getDao() {
        return detalleRepository;
    }
    
}
