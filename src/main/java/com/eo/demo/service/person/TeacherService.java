package com.eo.demo.service.person;

import com.eo.demo.entity.person.Instructor;
import com.eo.demo.entity.person.Principal;
import com.eo.demo.entity.person.Teacher;
import com.eo.demo.entity.quiz.Quiz;
import com.eo.demo.repository.person.InstructorRepository;
import com.eo.demo.repository.person.PrincipalRepository;
import com.eo.demo.service.quiz.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {

    private final InstructorRepository instructorRepository;
    private final PrincipalRepository principalRepository;
    private final QuizService quizService;

    public void doQuiz(Long instructorId) {
        Instructor instructor = instructorRepository
                .findById(instructorId)
                .orElseThrow();

        Quiz quiz = instructor.doQuiz();
        quizService.save(quiz);
    }

    public List<Teacher> list() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.addAll(instructorRepository.findAll());
        teachers.addAll(principalRepository.findAll());
        return teachers;
    }

    public void promotePrincipal() {
        Principal principal = principalRepository.findAll().get(0);
        principal.increaseWage();
    }

}
