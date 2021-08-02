package com.chakmol.CrudMVC.impl;

import com.chakmol.CrudMVC.commons.GenericServiceImpl;
import com.chakmol.CrudMVC.dao.PeopleDaoApi;
import com.chakmol.CrudMVC.model.People;
import com.chakmol.CrudMVC.service.PeopleServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<People, Long> implements PeopleServiceApi {
    @Autowired
    private PeopleDaoApi peopleDaoApi;

    /*
    * Al definir el dao o repositorio al que nos vamos a conectar
    * no ira directamente a PeopleServiceApi a consultar, si no
    * a la interfaz Generic Service Api en la cual al ser una interfaz
    * generica, podra hacer uso de cualquier dao que nosotros definamos.
    * */
    @Override
    public CrudRepository<People, Long> getDao() {
        return peopleDaoApi;
    }
}
