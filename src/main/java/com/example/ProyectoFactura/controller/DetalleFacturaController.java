package com.example.ProyectoFactura.controller;

import com.example.ProyectoFactura.model.DetalleFactura;
import com.example.ProyectoFactura.services.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleFactura")
public class DetalleFacturaController {

    @Autowired
    DetalleFacturaService DetalleFacturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<DetalleFactura>> obtenerLista() {
        return new ResponseEntity<>(DetalleFacturaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<DetalleFactura> crear(@RequestBody DetalleFactura c){
        return new ResponseEntity<>(DetalleFacturaService.save(c), HttpStatus.CREATED);
    }


    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        DetalleFacturaService.delete(id);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<DetalleFactura> updateUser(@PathVariable Integer id, @RequestBody DetalleFactura c) {
        if (DetalleFacturaService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        c.setCantidad(c.getCantidad());
        c.setFacturas(c.getFacturas());
        c.setProductos(c.getProductos());

        DetalleFactura newObjeto = DetalleFacturaService.save(c);
        return ResponseEntity.ok(newObjeto);
    }
}
