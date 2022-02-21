package com.eo.demo.controller.person;

import com.eo.demo.dto.RegisterStudentRequestDto;
import com.eo.demo.service.person.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping(path = "/register")
    public void register(@RequestBody RegisterStudentRequestDto requestDto) {
        studentService.register(requestDto);
    }

}
