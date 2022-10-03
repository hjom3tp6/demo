package rest.example.demo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.example.demo.dto.StudentDto;
import rest.example.demo.entity.Student;
import rest.example.demo.repository.StudentRepository;
import rest.example.demo.service.StudentService;

/**
 * @author Mark
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public StudentDto addStudent(String name, int age) {
    Student student = new Student();
    student.setName(name);
    student.setAge(age);
    Student studentResponse = studentRepository.save(student);
    return modelMapper.map(studentResponse, StudentDto.class);
  }

  @Override
  public Student getStudentById(long id) {
    return studentRepository.getReferenceById(id);
  }
}
