package com.example.ProyectoFactura.controller;


import com.example.ProyectoFactura.model.Producto;
import com.example.ProyectoFactura.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> obtenerLista() {
        return new ResponseEntity<>(productoService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Producto> crear(@RequestBody Producto c){
        return new ResponseEntity<>(productoService.save(c), HttpStatus.CREATED);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<Producto> updateUser(@PathVariable Integer id, @RequestBody Producto c) {
        if (productoService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        c.setNombre(c.getNombre());
        c.setStock(c.getStock());
        c.setPrecio(c.getPrecio());

        Producto newObjeto = productoService.save(c);
        return ResponseEntity.ok(newObjeto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        productoService.delete(id);
    }
}