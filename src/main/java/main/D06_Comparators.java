package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.LightBulb;
import model.Toaster;

/**
 * Comparators
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D06_Comparators {

   public static void main(String[] args) {
      List<String> names = new ArrayList<>();
      names.add("Hans");
      names.add("Peter");
      names.add("Lisa");

      Collections.sort(names);
      System.out.println(names);

      List<Integer> numbers = new LinkedList<>();
      numbers.add(5);
      numbers.add(7);
      numbers.add(5);
      numbers.add(2);

      Collections.sort(numbers);
      System.out.println(numbers);

      List<LightBulb> lightBulbs = new ArrayList<>();
      lightBulbs.add(new LightBulb("white"));
      lightBulbs.add(new LightBulb("red"));
      lightBulbs.add(new LightBulb("red"));
      lightBulbs.add(new LightBulb("white"));
      lightBulbs.add(new LightBulb("green"));

      Collections.sort(lightBulbs);
      System.out.println(lightBulbs);

      List<Toaster> toasters = new ArrayList<>();
      toasters.add(new Toaster(1));
      toasters.add(new Toaster(3));
      toasters.add(new Toaster(1));
      toasters.add(new Toaster(2));

      Collections.sort(toasters);
      System.out.println(toasters);
   }

}
