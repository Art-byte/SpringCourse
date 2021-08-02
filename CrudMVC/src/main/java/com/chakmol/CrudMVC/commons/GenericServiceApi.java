package com.chakmol.CrudMVC.commons;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
/*
* Este repositorio nos puede ayudar para generar valores de manera
* generica, es una forma de poder utilizar varios tipos de clases
* directamente
* */
@Service
public interface GenericServiceApi<T, ID extends Serializable> {
    T save(T entity);
    void delete(ID id);
    T get(ID id);
    List<T> getAll();

}
