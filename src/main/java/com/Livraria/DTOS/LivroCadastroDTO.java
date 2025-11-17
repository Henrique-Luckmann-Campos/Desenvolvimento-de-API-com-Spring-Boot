package com.Livraria.DTOS;

public record LivroCadastroDTO (
         String titulo,
         String autor,
         String isbn,
         Integer anoPublicacao,
         String genero

) {

}
