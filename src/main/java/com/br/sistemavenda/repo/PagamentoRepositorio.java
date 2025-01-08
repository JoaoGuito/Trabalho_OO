package com.br.sistemavenda.repo;

import com.br.sistemavenda.domain.Pagamento;
import org.springframework.data.repository.CrudRepository;

public interface PagamentoRepositorio extends CrudRepository<Pagamento, Long> {
}
