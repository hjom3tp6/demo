package rest.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/**
 * entity class.
 *
 * @author Mark
 */
@Entity
@Data
@Table(name = "Student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private int age;


}
