package com.eo.demo.controller.quiz;

import com.eo.demo.entity.quiz.Quiz;
import com.eo.demo.service.quiz.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(path = "/find-by-branch/{branchName}")
    public List<Quiz> findByBranch(@PathVariable String branchName) {
        return quizService.findByBranch(branchName);
    }

}
