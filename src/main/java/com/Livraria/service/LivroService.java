package com.Livraria.service;


import com.Livraria.exception.RecursoNaoEncontradoException;
import com.Livraria.model.Livro;
import com.Livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // CREATE
    public Livro criarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    // READ All
    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    // READ By ID
    public Livro buscarPorId(Long id) {
        return livroRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Livro", "ID", id));
    }

    // UPDATE

    public Livro atualizarLivro(Long id, Livro detalhesLivro) {

        Livro livro = buscarPorId(id);

        // Atualiza campos (presumindo que getters/setters existem)
        livro.setTitulo(detalhesLivro.getTitulo());
        livro.setAutor(detalhesLivro.getAutor());
        livro.setIsbn(detalhesLivro.getIsbn());
        livro.setAnoPublicacao(detalhesLivro.getAnoPublicacao());
        livro.setGenero(detalhesLivro.getGenero());

        return livroRepository.save(livro);
    }


    // DELETE
    public void deletarLivro(Long id) {
        Livro livro = buscarPorId(id);
        livroRepository.delete(livro);
    }
}
