package com.learningspring.udemy.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {//this mimics CrudRepository interface
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
