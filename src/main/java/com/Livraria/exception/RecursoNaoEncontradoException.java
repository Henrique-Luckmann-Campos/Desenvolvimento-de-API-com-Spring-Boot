package com.Livraria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Garante que o Spring retorne um status 404 (Not Found)
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecursoNaoEncontradoException extends RuntimeException {

    public RecursoNaoEncontradoException(String recurso, String campo, Object valor) {
        super(String.format("%s não encontrado com %s : '%s'", recurso, campo, valor));
    }
}