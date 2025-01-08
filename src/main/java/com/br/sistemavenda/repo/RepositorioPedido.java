package com.br.sistemavenda.repo;

import com.br.sistemavenda.domain.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioPedido extends CrudRepository<Pedido, Integer> {

}
