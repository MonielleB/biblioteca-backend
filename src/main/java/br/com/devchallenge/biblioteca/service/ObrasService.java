package br.com.devchallenge.biblioteca.service;

import br.com.devchallenge.biblioteca.controller.contratos.ObrasRequest;
import br.com.devchallenge.biblioteca.controller.contratos.ObrasResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ObrasService {

    public ObrasResponse save(ObrasRequest obras){

        ObrasResponse obras1 = new ObrasResponse();

        obras1.setId("1");
        obras1.setTitulo(obras.getTitulo());
        obras1.setEditora(obras.getEditora());
        obras1.setUrlFotoCapa(obras.getUrlFotoCapa());
        obras1.setAutores(obras.getAutores());

        return obras1;
    }

    public List<ObrasResponse> list() {

        ObrasResponse response = new ObrasResponse();
        ObrasResponse response2 = new ObrasResponse();

        response.setId("1");
        response.setTitulo("Harry Potter");
        response.setEditora("Rocco");
        response.setUrlFotoCapa("https://i.imgur.com/UH3IPXw.jpg");
        response.setAutores(Arrays.asList("JK Rowling", "abc", "..."));

        response2.setId("2");
        response2.setTitulo("audhaudhua");
        response2.setEditora("adjhjahf");
        response2.setUrlFotoCapa("https:xxxx.jpg");
        response2.setAutores(Arrays.asList("JK Rowling", "abc", "..."));

        return Arrays.asList(response, response2);

    }
}
