package com.chakmol.CrudMVC.dao;

import com.chakmol.CrudMVC.model.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleDaoApi extends CrudRepository<People, Long> {
}
