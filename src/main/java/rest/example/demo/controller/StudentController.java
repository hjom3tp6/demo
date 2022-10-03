package rest.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.example.demo.dto.StudentDto;
import rest.example.demo.entity.Student;
import rest.example.demo.service.StudentService;

/**
 * Controller for students.
 *
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
  public ResponseEntity<StudentDto> createStudent(@RequestBody Student student) {
    StudentDto studentResult = studentServiceImpl.addStudent(student.getName(), student.getAge());
    return new ResponseEntity<>(studentResult, HttpStatus.OK);
  }


}
