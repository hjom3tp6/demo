package rest.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.example.demo.entity.Student;

/**
 * StudentRepository.
 *
 * @author Mark.Cui
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}