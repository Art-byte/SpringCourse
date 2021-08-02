package com.chakmol.CrudMVC.commons;

import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericServiceApi<T, ID>{

    @Override
    public T save(T entity) {
        return getDao().save(entity);
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }

    @Override
    public T get(ID id) {
        Optional<T> object = getDao().findById(id);
        if(object.isPresent()){
            return object.get();
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        List<T> returnList = new ArrayList<>();
        getDao().findAll().forEach(obj -> returnList.add(obj));
        return returnList;
    }

    /*
    * Este metodo nos va a permitir saber que repositorio es el que
    * estamos consumiendo.
    * */
    public abstract CrudRepository<T, ID> getDao();
}