/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LENOVO
 */
@Entity
@Getter
@Setter
@Table(name = "Productos")
public class Producto {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_producto")
   private Integer id_producto;
   @Column(name = "nombre")
   private String nombre;
   @Column(name = "precio")
   private Double precio;
   @Column(name = "stock")
   private Integer stock;
   
   @OneToMany(mappedBy = "productos")
   private List<DetalleFactura>detallesProductos;
    
}
