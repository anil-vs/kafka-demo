package com.eo.demo.controller.person;

import com.eo.demo.entity.person.Teacher;
import com.eo.demo.service.person.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/teacher")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(path = "/do-quiz/{instructorId}")
    public void doQuiz(@PathVariable Long instructorId) {
        teacherService.doQuiz(instructorId);
    }

    @GetMapping(path = "/list")
    public List<Teacher> list() {
        return teacherService.list();
    }

}
