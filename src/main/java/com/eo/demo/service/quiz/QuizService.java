package com.eo.demo.service.quiz;

import com.eo.demo.entity.person.Branch;
import com.eo.demo.entity.quiz.Quiz;
import com.eo.demo.repository.quiz.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;

    public void save(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public List<Quiz> findByBranch(String branchName) {
        Branch branch = Branch.valueOf(branchName);
        return quizRepository.findByBranch(branch);
    }

}
