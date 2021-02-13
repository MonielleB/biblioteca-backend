package br.com.devchallenge.biblioteca.service;

import br.com.devchallenge.biblioteca.controller.contratos.ObrasRequest;
import br.com.devchallenge.biblioteca.controller.contratos.ObrasResponse;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = ObrasService.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
@ActiveProfiles("test")
public class ObrasServiceTest {

    @Autowired
    private ObrasService service;

    @Before("")
    public void setUp(){

    }

    @Test
    @SuppressWarnings("unchecked")
    public void shouldReturnObraCreatedWithSuccess() throws Exception {

        ObrasRequest request = new ObrasRequest();

        request.setTitulo("Harry Potter");
        request.setEditora("Rocco");
        request.setUrlFotoCapa("https://i.imgur.com/UH3IPXw.jpg");
        request.setAutores(Arrays.asList("[JK Rowling]", "abc", "..."));

        ObrasResponse response = service.save(request);

        assertNotNull(response);
        assertEquals(response.getTitulo(),request.getTitulo());
        assertEquals(response.getEditora(), request.getEditora());
        assertEquals(response.getUrlFotoCapa(), request.getUrlFotoCapa());
        assertEquals(response.getAutores(), request.getAutores());

    }

    @Test
    @SuppressWarnings("unchecked")
    public void shouldReturnListOfObras() throws Exception {

    }


    @After("")
    public void tearDown() {
//        service.clearObjects();
    }
}
