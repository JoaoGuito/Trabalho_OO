package com.br.sistemavenda.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue
    private Long id;
    private int quantidade;
    @OneToOne(cascade = CascadeType.ALL)
    private Produto produto;

    public ItemPedido(Long id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public ItemPedido() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean produtoExiste() {
        return Objects.nonNull(this.produto) && Objects.nonNull(this.produto.getId());
    }
}
