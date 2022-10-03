package rest.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author Mark
 */
@ToString
@Data
@Builder
@AllArgsConstructor
public class StudentDto {

  private Long id;
  private String name;
  private Integer age;
}
