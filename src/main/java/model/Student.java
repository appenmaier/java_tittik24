package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Student
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
public class Student implements Comparable<Student> {

   private String id;
   private String name;

   @Override
   public int compareTo(Student other) {
      return other.name.compareTo(name);
   }

}
