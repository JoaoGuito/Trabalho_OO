package com.br.sistemavenda.repo;

import com.br.sistemavenda.domain.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<Produto, Long> {
}
