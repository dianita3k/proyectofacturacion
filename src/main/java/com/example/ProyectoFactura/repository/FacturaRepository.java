/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ProyectoFactura.repository;

import com.example.ProyectoFactura.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 59398
 */
public interface FacturaRepository extends JpaRepository<Factura, Integer>{
    
}
