package com.example.ProyectoFactura.controller;


import com.example.ProyectoFactura.model.Factura;
import com.example.ProyectoFactura.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>> obtenerLista() {
        return new ResponseEntity<>(facturaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Factura> crear(@RequestBody Factura c){
        return new ResponseEntity<>(facturaService.save(c), HttpStatus.CREATED);
    }


    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        facturaService.delete(id);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<Factura> updateUser(@PathVariable Integer id, @RequestBody Factura c) {
        if (facturaService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        c.setCliente(c.getCliente());
        c.setFecha(c.getFecha());
        c.setDetalles(c.getDetalles());

        Factura newObjeto = facturaService.save(c);
        return ResponseEntity.ok(newObjeto);
    }
}
