package com.biolab.ecommerce.entities;

import com.biolab.ecommerce.entities.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
// substitui os getters, setters e toString
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
