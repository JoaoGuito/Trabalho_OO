package com.br.sistemavenda.domain;

import jakarta.persistence.*;

import java.util.List;

public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Vendedor vendedor;

    @OneToOne
    private FormaPagamento pagamento;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemPedido> itens;

    public Pedido(Long id, Cliente cliente, Vendedor vendedor, FormaPagamento pagamento, List<ItemPedido> itens) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.pagamento = pagamento;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public FormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
