package com.eo.demo.entity.quiz;

import com.eo.demo.entity.person.Student;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class QuizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Integer grade;

}
