package com.learningspring.udemy.petclinic.services.map;

import com.learningspring.udemy.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object!=null){
            if(object.getId()==null){
                object.setId(getNextID());
            }
        }else{
            throw new RuntimeException("object can't be null");
        }
        map.put(object.getId(),object);
        return object;
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextID(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet() ) + 1;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }
         return nextId;
    }
}
