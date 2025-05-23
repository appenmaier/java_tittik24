package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import model.Exam;
import model.Student;

/**
 * Maps
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_Maps {

   public static void main(String[] args) {
      Map<Student, Exam> studentsWithGrade = new HashMap<>();

      /* Werte setzen */
      studentsWithGrade.put(new Student("1", "Max"), new Exam("Mathe", 3.4));
      studentsWithGrade.put(new Student("2", "Peter"), new Exam("Mathe", 2.2));
      studentsWithGrade.put(new Student("3", "Lisa"), new Exam("Mathe", 1.7));
      studentsWithGrade.put(new Student("4", "Anna"), new Exam("Mathe", 5.0));

      /* Werte lesen */
      System.out.println(studentsWithGrade.get(new Student("3", "Lisa")));

      /* Werte prüfen */
      System.out.println(studentsWithGrade.containsKey(new Student("2", "Peter")));
      System.out.println(studentsWithGrade.containsValue(new Exam("Mathe", 1.0)));

      /* Werte überschreiben */
      System.out.println(studentsWithGrade.put(new Student("4", "Anna"), new Exam("Mathe", 2.0)));
      System.out.println(studentsWithGrade.get(new Student("4", "Anna")));

      /* Werte ausgeben */
      System.out.println(studentsWithGrade);
      System.out.println();

      /* Datensammlung: Die Menge aller Schlüssel */
      System.out.println("Anwesenheitsliste");
      for (Student s : studentsWithGrade.keySet()) {
         System.out.printf("%-20s [ ]%n", s.getName());
      }
      System.out.println();

      /* Datensammlung: Alle Werte */
      double total = 0;
      for (Exam e : studentsWithGrade.values()) {
         total += e.getGrade();
      }
      System.out.println("Durchschnitt: " + total / studentsWithGrade.values().size());
      System.out.println();

      /* Datensammlung: Die Menge aller Schlüssel-Wert-Paare */
      System.out.println("Notenliste: ");
      for (Entry<Student, Exam> entry : studentsWithGrade.entrySet()) {
         Student s = entry.getKey();
         Exam e = entry.getValue();
         System.out.println(s.getId() + ": " + e.getGrade());
      }
   }

}
