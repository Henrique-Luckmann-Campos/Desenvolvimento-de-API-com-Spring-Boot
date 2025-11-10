package com.Livraria.controller;

import com.livraria.model.Livro;
import com.livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid; // use jakarta.* se estiver no Spring Boot 3+
import java.util.List;

@RestController
@RequestMapping("/api/v1/livros") // versão da API
public class LivroController {

    @Autowired
    private LivroService livroService;

    // POST: Cria um novo livro (201 CREATED)
    @PostMapping
    public ResponseEntity<Livro> criarLivro(@Valid @RequestBody Livro livro) {
        Livro novoLivro = livroService.criarLivro(livro);
        return new ResponseEntity<>(novoLivro, HttpStatus.CREATED);
    }

    // GET: Lista todos os livros (200 OK)
    @GetMapping
    public ResponseEntity<List<Livro>> listarTodosLivros() {
        List<Livro> livros = livroService.listarTodos();
        return ResponseEntity.ok(livros);
    }

    // GET: Busca livro por ID (200 OK ou 404 NOT FOUND)
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarLivroPorId(@PathVariable Long id) {
        Livro livro = livroService.buscarPorId(id);
        if (livro != null) {
            return ResponseEntity.ok(livro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
