package com.maven.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maven.demo.domain.Persona;
import com.maven.demo.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaRest {

    @Autowired
    private PersonaRepository repo;

    @PostMapping("/save")
    public String saveBook(@RequestBody Persona persona){
        repo.save(persona);
        return "Nueva persona";
    }

    @GetMapping("/findall")
    public List<Persona> getAllPerson() {
        return repo.findAll();
    }
}