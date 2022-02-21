insert into student (name, age, gpa) values ('student1', 28, 2.0);

insert into teacher (name, age, branch, type) values ('teacher1', 40, 'MATH', 'I');
insert into teacher (name, age, branch, type) values ('principal', 50, 'PHYSICS', 'P');
insert into teacher (name, age, branch, type) values ('teacher3', 50, 'HISTORY', 'I');

insert into quiz (teacher_id) values (1);
insert into quiz (teacher_id) values (2);
insert into quiz (teacher_id) values (3);

insert into quiz_result (quiz_id, student_id, grade) values (1, 1, 60);
insert into quiz_result (quiz_id, student_id, grade) values (2, 1, 70);
insert into quiz_result (quiz_id, student_id, grade) values (3, 1, 80);