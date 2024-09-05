package com.chai.springJdbc;

import com.chai.springJdbc.model.Student;
import com.chai.springJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
        Student s = context.getBean(Student.class);
        s.setRollno(10);
        s.setMarks(80);
        s.setName("akshat");

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> stds = service.getStudents();
        System.out.println(stds);
    }

}
