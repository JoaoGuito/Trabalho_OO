package com.br.sistemavenda.controller;

import com.br.sistemavenda.domain.Cliente;
import com.br.sistemavenda.repo.ClienteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepositorio repositorio;

    @GetMapping
    public List<Cliente> buscarTodos(){
        return repositorio.buscarTodos();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente){
        return repositorio.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@RequestBody Cliente cliente, @PathVariable Long id){
        cliente.setId(id);
        return repositorio.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        repositorio.deleteById(id);
    }

}
