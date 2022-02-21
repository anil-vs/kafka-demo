package com.eo.demo.repository.person;

import com.eo.demo.entity.person.Principal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrincipalRepository extends CrudRepository<Principal, Long> {

    List<Principal> findAll();

}
