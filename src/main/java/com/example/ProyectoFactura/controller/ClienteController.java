
package com.example.ProyectoFactura.controller;

import com.example.ProyectoFactura.model.Cliente;
import com.example.ProyectoFactura.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> obtenerLista() {
        return new ResponseEntity<>(clienteService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crear(@RequestBody Cliente c) {
        return new ResponseEntity<>(clienteService.save(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        clienteService.delete(id);
    }


    @PutMapping("actualizar/{id}")
    public ResponseEntity<Cliente> updateUser(@PathVariable Integer id, @RequestBody Cliente c) {
        if (clienteService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        c.setCedula(c.getCedula());
        c.setNombre(c.getNombre());
        c.setApellido(c.getApellido());

        Cliente newObjeto = clienteService.save(c);
        return ResponseEntity.ok(newObjeto);
    }

}
