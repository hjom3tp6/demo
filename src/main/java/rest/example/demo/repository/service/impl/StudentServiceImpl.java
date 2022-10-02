package rest.example.demo.repository.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.example.demo.entity.Student;
import rest.example.demo.repository.StudentRepository;
import rest.example.demo.repository.service.StudentService;

/**
 * @author Mark
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(String name, int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.getReferenceById(id);
    }
}
