package org.example.registrodecursos.controller;

import org.example.registrodecursos.dto.EstudanteRequest;
import org.example.registrodecursos.dto.EstudanteResponse;
import org.example.registrodecursos.model.Estudante;
import org.example.registrodecursos.repository.EstudanteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private EstudanteRepository repository;

    public EstudanteController(EstudanteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estudante> todos(){
        return repository.findAll();
    }

    @PostMapping
    public Estudante inserir(@RequestBody EstudanteRequest request){

        Estudante estudante = request.toEstudante();

        return repository.save(estudante);
    }

}
