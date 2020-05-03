package com.learningspring.udemy.petclinic.services;

import com.learningspring.udemy.petclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet,Long> {

}
