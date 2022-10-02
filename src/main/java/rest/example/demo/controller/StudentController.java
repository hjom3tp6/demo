package rest.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.example.demo.entity.Student;
import rest.example.demo.repository.service.StudentService;

/**
 * @author Mark
 */
@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentServiceImpl;

    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long id) {
        Student student = studentServiceImpl.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/Student")
    public  ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student studentResult = studentServiceImpl.addStudent(student.getName(), student.getAge());
        return new ResponseEntity<>(studentResult, HttpStatus.OK);
    }


}
