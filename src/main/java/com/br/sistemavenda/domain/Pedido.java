package com.br.sistemavenda.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Vendedor vendedor;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Pagamento pagamento;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemPedido> itens;

    public Pedido(Long id, Cliente cliente, Vendedor vendedor, Pagamento pagamento, List<ItemPedido> itens) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.pagamento = pagamento;
        this.itens = itens;
    }

    public Pedido() {
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

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public boolean clientNulo() {
        return Objects.nonNull(this.cliente) && Objects.nonNull(this.cliente.getId());
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public boolean vendedorNulo() {
        return this.vendedor.vendedorExiste();
    }

    public boolean pagamentoNulo() {
        return Objects.nonNull(this.pagamento) && Objects.nonNull(this.pagamento.getId());
    }
}
