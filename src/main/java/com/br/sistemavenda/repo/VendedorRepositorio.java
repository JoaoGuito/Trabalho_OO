package com.br.sistemavenda.repo;

import com.br.sistemavenda.domain.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepositorio extends JpaRepository<Vendedor, Long> {
}
