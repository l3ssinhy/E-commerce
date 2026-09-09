package com.biolab.ecommerce.controllers;

import com.biolab.ecommerce.DTOs.PedidoDTO;
import com.biolab.ecommerce.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService pedidoService) {
        this.service = pedidoService;
    }

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody PedidoDTO dto) {
        return ResponseEntity.ok(service.criarPedido(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delOrder(@PathVariable long id) {
        service.deletarPedido(id);
        return ResponseEntity.ok("Apagado com sucesso");
    }
}
