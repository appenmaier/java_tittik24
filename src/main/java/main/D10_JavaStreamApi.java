package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Person;

public class D10_JavaStreamApi {

   public static void main(String[] args) {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Hans", 'm'));
      persons.add(new Person("Peter", 'm'));
      persons.add(new Person("Lisa", 'w'));
      persons.add(new Person("Maria", 'w'));
      persons.add(new Person("Max", 'm'));
      persons.add(new Person("Anna", 'w'));
      persons.add(new Person("Heidi", 'w'));
      persons.add(new Person("Maja", 'w'));

      /* imperativ */
      List<String> names = new ArrayList<>();

      for (Person p : persons) {
         if (p.gender() == 'w') {
            if (p.name().length() == 4) {
               String name = p.name().toUpperCase();
               names.add(name);
            }
         }
      }

      Collections.sort(names);
      names = names.reversed();
      names.forEach(System.out::println);
      System.out.println();

      /* funktional */
      persons.stream()
            .filter(p -> p.gender() == 'w')
            .filter(p -> p.name().length() == 4)
            .map(p -> p.name().toUpperCase())
            .sorted()
            .toList()
            .reversed()
            .forEach(System.out::println);
   }

}
