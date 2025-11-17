package com.Livraria.repository;


import com.Livraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    // Método para buscar um livro por ISBN (exemplo de query customizada, opcional para o CRUD básico)
    Optional<Livro> findByIsbn(String isbn);
}