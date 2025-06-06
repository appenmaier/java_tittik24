package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Student;

/**
 * Inner Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_InnerClasses {

   public static void main(String[] args) {
      List<Student> students = new ArrayList<>();
      students.add(new Student("2817364", "Hans"));
      students.add(new Student("9102743", "Anna"));
      students.add(new Student("7718235", "Lisa"));
      students.add(new Student("6109021", "Max"));

      /* Lokale Klassen */
      class StudentsByNameDescendingComparator implements Comparator<Student> {

         @Override
         public int compare(Student student1, Student student2) {
            return student2.getName().compareTo(student1.getName());
         }

      }
      Collections.sort(students, new StudentsByNameDescendingComparator());
      for (Student s : students) {
         System.out.println(s);
      }
      System.out.println();

      /* Anonyme Klassen */
      Collections.sort(students, new Comparator<Student>() {

         @Override
         public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
         }

      });
      for (Student s : students) {
         System.out.println(s);
      }
      System.out.println();

      /* Lambda Ausdrücke */
      Collections.sort(students,
            (student1, student2) -> student1.getId().compareTo(student2.getId()));
      students.forEach(s -> System.out.println(s));
      System.out.println();

      /* Methodenreferenzen */
      students.forEach(Student::getOlder);
      students.forEach(System.out::println);
   }

}
