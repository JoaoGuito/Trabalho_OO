package com.br.sistemavenda.repo;

import com.br.sistemavenda.domain.Cliente;
import com.br.sistemavenda.domain.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.stream.StreamSupport;

public interface PedidoRepositorio extends CrudRepository<Pedido, Long> {

    default List<Pedido> buscarTodos(){
        return StreamSupport.stream(this.findAll().spliterator(), false).toList();
    };

}
