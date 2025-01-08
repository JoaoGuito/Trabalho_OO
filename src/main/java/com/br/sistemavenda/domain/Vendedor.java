package com.br.sistemavenda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
//@Getter substitiu os getters e setters
//@Setter
public class Vendedor extends Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private double comissao;

    public Vendedor(String nome, double comissao) {
        this.nome = nome;
        this.comissao = comissao;
    }

    public Vendedor() {
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean vendedorExiste(){
        return Objects.nonNull(this.id);
    }
}
