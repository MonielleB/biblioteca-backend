package br.com.devchallenge.biblioteca.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Obras {

    private Long id;
    private String titulo;
    private String editora;
    private String urlFotoCapa;
    private List<String> autores;

}
