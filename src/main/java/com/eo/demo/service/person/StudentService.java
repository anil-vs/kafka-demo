package com.eo.demo.service.person;

import com.eo.demo.configuration.KafkaConfig;
import com.eo.demo.dto.RegisterStudentRequestDto;
import com.eo.demo.entity.person.Student;
import com.eo.demo.repository.person.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final KafkaTemplate<String, RegisterStudentRequestDto> kafkaTemplate;

    public void register(RegisterStudentRequestDto requestDto) {
        Student student = new Student();
        student.setName(requestDto.getName());
        student.setAge(requestDto.getAge());

        save(student);

        kafkaTemplate.send(KafkaConfig.REGISTER_TOPIC, requestDto);
    }

    @KafkaListener(topics = KafkaConfig.REGISTER_TOPIC, groupId = KafkaConfig.CONSUMER_GROUP, containerFactory = "kafkaListenerContainerFactory")
    public void registerListener(RegisterStudentRequestDto requestDto) {
        quiz(requestDto.getName());
        promote();
    }

    private void save(Student student) {
        studentRepository.save(student);
    }

    private void quiz(String name) {
        System.out.println(name + " quizzes done");
    }

    private void promote() {
        System.out.println("principal promotion done");
    }

}
