package com.br.sistemavenda.repo;

import com.br.sistemavenda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.stream.StreamSupport;

public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {

    default List<Cliente> buscarTodos(){
        return StreamSupport.stream(this.findAll().spliterator(), false).toList();
    };
}
