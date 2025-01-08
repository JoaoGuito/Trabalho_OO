package com.br.sistemavenda.controller;

import com.br.sistemavenda.domain.Pedido;
import com.br.sistemavenda.domain.Produto;
import com.br.sistemavenda.repo.PedidoRepositorio;
import com.br.sistemavenda.repo.ProdutoRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepositorio repositorio;

    @Autowired
    private ProdutoRepositorio repositorioProduto;


    @GetMapping
    public List<Pedido> buscarTodos() {
        return repositorio.buscarTodos();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable String id) {
        return repositorio.findById(Long.valueOf(id)).orElse(null);
    }

    @PostMapping
    @Transactional
    public Pedido adicionar(@RequestBody Pedido pedido) {


        pedido.getItens().forEach(item -> {
            Produto produto = item.getProduto();
            if (produto != null) {
                Produto produtoGerenciado;
                if (produto.getId() != null) {
                    produtoGerenciado = repositorioProduto.findById(produto.getId())
                            .orElseThrow(() -> new IllegalArgumentException("Produto com ID " + produto.getId() + " não encontrado!"));
                } else {
                    produtoGerenciado = repositorioProduto.save(produto);
                }
                item.setProduto(produtoGerenciado);
            }
        });

        return repositorio.save(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizar(@RequestBody Pedido pedido, @PathVariable Long id) {
        pedido.setId(id);
        return repositorio.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        repositorio.deleteById(id);
    }

}
