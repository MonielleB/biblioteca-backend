package br.com.devchallenge.biblioteca.controller.contratos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ObrasRequest {

    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("editora")
    private String editora;

    @JsonProperty("foto")
    private String urlFotoCapa;

    @JsonProperty("autores")
    private List<String> autores;

}
