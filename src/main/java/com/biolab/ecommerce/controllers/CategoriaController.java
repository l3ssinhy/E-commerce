package com.biolab.ecommerce.controllers;

import com.biolab.ecommerce.DTOs.CategoriaDTO;
import com.biolab.ecommerce.services.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> criarCat(@RequestBody CategoriaDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criarCategoria(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarCat(@PathVariable long id){
        // status code 200
        return ResponseEntity.ok().body(service.buscarCatId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCat(@PathVariable long id){
        service.delete(id); // status code 204
        return ResponseEntity.noContent().build();
    }

}
