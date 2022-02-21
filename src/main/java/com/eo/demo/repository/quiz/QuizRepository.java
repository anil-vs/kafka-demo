package com.eo.demo.repository.quiz;

import com.eo.demo.entity.person.Branch;
import com.eo.demo.entity.quiz.Quiz;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {

    @Query("select q " +
            "from Quiz q " +
            "where q.teacher.branch = :branch")
    List<Quiz> findByBranch(Branch branch);

    List<Quiz> findAll();

}
