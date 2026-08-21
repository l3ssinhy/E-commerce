package com.biolab.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Entity
// substitui os getters e setters
@Data
// substitui o contrutor com todos os argumentos
@AllArgsConstructor
// substitui o construtor vazio
@NoArgsConstructor
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Instant momento;
    private StatusPedido status;
    @ManyToOne
    private Usuario cliente;
}
