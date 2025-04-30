package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.PlugType;

/**
 * Java API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_JavaAPI {

   @SuppressWarnings("unused")
   public static void main(String[] args) throws FileNotFoundException {
      /* List */
      List<String> names = new ArrayList<>(); // = new LinkedList<>();

      names.add("Hans");
      names.add("Lisa");
      names.add("Peter");
      names.add(1, "Max");

      System.out.println(names);
      System.out.println("Name an Position 3?: " + names.get(2));
      System.out.println("Anzahl Namen?: " + names.size());

      names.remove("Peter");
      System.out.println(names);

      /* Wrapper-Klassen */
      double d1 = 3.6;
      Double d2 = d1;
      double d3 = Double.valueOf("7.9");

      /* Datums- und Zeitangaben */
      System.out.println(System.currentTimeMillis());
      LocalDateTime now = LocalDateTime.now();
      System.out.println(now.getDayOfYear());
      System.out.println(now);
      System.out.println(now.getHour());
      LocalDate christmasEve = LocalDate.of(2025, 12, 24);
      LocalDate newYearsEve = LocalDate.parse("2025-12-31");
      System.out.println(christmasEve.getMonth());

      /* Pseudozufallszahlen */
      Random random = new Random();
      for (int i = 0; i < 100; i++) {
         System.out.println(random.nextInt(1, 7));
      }

      /* Math */
      System.out.println(Math.sqrt(9));

      /* Enumeration */
      PlugType typeF = PlugType.TYPE_F;
      PlugType typeF2 = PlugType.TYPE_F;
      PlugType typeF3 = PlugType.valueOf("TYPE_F");

      /* Lesen von Dateien */
      File file = new File("src/main/resources/main/input.txt");

      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         String name = tokens[0];
         int age = Integer.valueOf(tokens[1]);
         PlugType plugType = PlugType.valueOf(tokens[2]);
         double sizeInM = Double.valueOf(tokens[3]);
      }

      scanner.close();
   }

}
