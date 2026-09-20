package com.projects.ewallet.domain.model.credito;

import com.projects.ewallet.domain.model.billetera.Cliente;
import com.projects.ewallet.domain.model.EstadoPrestamo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Prestamo {

    private Long id;
    private Cliente cliente;
    private ProductoCrediticio productoCrediticio;
    private BigDecimal amountSuccess;
    private Integer plazos;
    private BigDecimal tcea;
    private LocalDateTime fechaDesembolso;
    private EstadoPrestamo estado;

    public Prestamo(Long id, Cliente cliente, BigDecimal amountSuccess, BigDecimal tcea, LocalDateTime fechaDesembolso, EstadoPrestamo estado, Integer plazos, ProductoCrediticio productoCrediticio) {
        this.id = id;
        this.cliente = cliente;
        this.amountSuccess = amountSuccess;
        this.tcea = tcea;
        this.fechaDesembolso = fechaDesembolso;
        this.estado = estado;
        this.plazos = plazos;
        this.productoCrediticio = productoCrediticio;
    }


    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ProductoCrediticio getProductoCrediticio() {
        return productoCrediticio;
    }

    public BigDecimal getAmountSuccess() {
        return amountSuccess;
    }

    public Integer getPlazos() {
        return plazos;
    }

    public BigDecimal getTcea() {
        return tcea;
    }

    public LocalDateTime getFechaDesembolso() {
        return fechaDesembolso;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }
}
