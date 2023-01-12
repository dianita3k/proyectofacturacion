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
@Table(name = "Clientes")

public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_cliente")
   private Integer id_cliente;
   @Column(name = "nombre")
   private String nombre;
   @Column(name = "apellido")
   private String apellido;
   @Column(name = "cedula")
   private String cedula;
   @Column(name = "correo")
   private String correo;
   
   @OneToMany(mappedBy = "cliente")
   private List<Factura>facturas;
   
   
}
