package rest.example.demo.repository.service;

import rest.example.demo.entity.Student;

/**
 * @author Mark
 */
public interface StudentService {

    /**
     * add Student
     * @param name
     * @param age
     * @return Student
     */
    Student addStudent(String name, int age);

    /**
     * get Student By ID
     * @param id
     * @return Student
     */
    Student getStudentById(long id);
}
