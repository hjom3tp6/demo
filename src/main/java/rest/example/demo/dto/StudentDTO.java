package rest.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Mark
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
public class StudentDTO {

    private Long id;
    private String name;
    private Integer age;
}
