package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Exam
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Exam {

   private String lecture;
   private double grade;

}
