package com.br.sistemavenda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class FormaPagamento extends Pagamento {

    @Id
    @GeneratedValue
    private Long id;
    private String formapagamento;

    public FormaPagamento(double valor, Date data, String formapagamento) {
        this.valor = valor;
        this.data = data;
        this.formapagamento = formapagamento;
    }

    public FormaPagamento() {

    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
}
