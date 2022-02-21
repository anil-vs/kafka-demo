package com.eo.demo.repository.person;

import com.eo.demo.entity.person.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {

    List<Instructor> findAll();

}
