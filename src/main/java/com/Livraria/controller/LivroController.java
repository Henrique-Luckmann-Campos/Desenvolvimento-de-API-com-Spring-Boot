package com.Livraria.controller;


import com.Livraria.DTOS.LivroCadastroDTO;
import com.Livraria.model.Livro;
import com.Livraria.repository.LivroRepository;
import com.Livraria.service.LivroService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid; // use jakarta.* se estiver no Spring Boot 3+


@RestController
@RequestMapping("/api/v1/livros") // versão da API
public class LivroController {

    @Autowired
    private LivroRepository repository;
    private LivroService livroService;

    // POST: Cria um novo livro (201 CREATED)
    @PostMapping
    @Transactional
    public void criarLivro(@Valid @RequestBody LivroCadastroDTO livro) {
        repository.save(new Livro(livro));
    }

    // GET: Lista todos os livros (200 OK)
    @GetMapping
    public void listarTodosLivros(@Valid @RequestBody LivroCadastroDTO livro) {
       repository.findAll((Pageable) new Livro(livro));
    }

    // GET: Busca livro por ID (200 OK ou 404 NOT FOUND)
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarLivroPorId(@PathVariable Long id) {


        Livro livro = livroService.buscarPorId(id);
        if (livro != null) {
            return ResponseEntity.ok(livro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
