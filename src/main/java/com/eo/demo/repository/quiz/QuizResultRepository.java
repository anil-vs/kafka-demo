package com.eo.demo.repository.quiz;

import com.eo.demo.entity.quiz.QuizResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizResultRepository extends CrudRepository<QuizResult, Long> {
}
