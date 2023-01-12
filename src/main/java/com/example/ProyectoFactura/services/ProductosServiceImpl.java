/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.services;

import com.example.ProyectoFactura.model.Producto;
import com.example.ProyectoFactura.repository.ProductoRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ProductosServiceImpl extends GenericServiceImpl<Producto, Integer>  implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    @Override
    public CrudRepository<Producto, Integer> getDao() {
         return productoRepository;
    }
    
}
