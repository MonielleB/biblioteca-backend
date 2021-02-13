package br.com.devchallenge.biblioteca.controller;

import br.com.devchallenge.biblioteca.controller.contratos.ObrasRequest;
import br.com.devchallenge.biblioteca.controller.contratos.ObrasResponse;
import br.com.devchallenge.biblioteca.service.ObrasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/obras")
public class ObrasController {

    @Autowired
    private ObrasService service;

    @PostMapping
    public ResponseEntity<ObrasResponse> cadastrarObra (@RequestBody ObrasRequest obras, UriComponentsBuilder uriBuilder){

        ObrasResponse response = service.save(obras);

        URI uri = uriBuilder.path("/obras/{id}").buildAndExpand(response.getId()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @GetMapping
    public ResponseEntity listarObras (){

        List<ObrasResponse> lista = service.list();

        if (!lista.isEmpty()){
            return ResponseEntity.ok(lista);
        }
        return ResponseEntity.notFound().build();
    }

}
