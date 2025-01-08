package com.br.sistemavenda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue
    private Long id;
    private double valor;
    private LocalDateTime data;
    private String formapagamento;

    public Pagamento(double valor, LocalDateTime data, String formapagamento) {
        this.valor = valor;
        this.data = data;
        this.formapagamento = formapagamento;
    }

    public Pagamento() {

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
