package com.learningspring.udemy.petclinic.services;

import com.learningspring.udemy.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> finaAll();

}
