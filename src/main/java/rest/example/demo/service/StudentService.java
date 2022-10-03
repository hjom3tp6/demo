package rest.example.demo.service;

import rest.example.demo.dto.StudentDto;
import rest.example.demo.entity.Student;

/** Student service.
 *
 * @author Mark
 */
public interface StudentService {

  /** add Student.
   *
   * @param name name of the student
   * @param age age of the student
   * @return Student
   */
  StudentDto addStudent(String name, int age);

  /** get Student By ID.
   *
   * @param id id of the student
   * @return Student
   */
  Student getStudentById(long id);
}
