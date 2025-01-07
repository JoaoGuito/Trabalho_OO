package com.br.sistemavenda.domain;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

    protected String nome;
    protected String cpf;

}