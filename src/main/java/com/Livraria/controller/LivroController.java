package com.Livraria.controller;

import com.Livraria.model.Livro;
import com.Livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/livros") // Versão da API
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
    public List<Livro> listarTodosLivros() {
        return livroService.listarTodos();
    }

    // GET: Busca livro por ID (200 OK ou 404 NOT FOUND via Exception)
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarLivroPorId(@PathVariable Long id) {
        Livro livro = livroService.buscarPorId(id);
        return ResponseEntity.ok(livro);
    }

    // PUT: Atualiza livro por ID (200 OK ou 404 NOT FOUND)
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id,
                                                @Valid @RequestBody Livro detalhesLivro) {
        Livro livroAtualizado = livroService.atualizarLivro(id, detalhesLivro);
        return ResponseEntity.ok(livroAtualizado);
    }

    // DELETE: Deleta livro por ID (204 NO CONTENT ou 404 NOT FOUND)
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }
}