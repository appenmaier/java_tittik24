package main;

import java.util.Scanner;

/**
 * Java Basics
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D01_JavaBasics {

   public static void main(String[] args) {
      primitiveDatatypes();
      arithmeticOperators();
      cases();
      loops();
      stringsAndArrays();
      io();
   }

   public static void primitiveDatatypes() {
      /* Ganze Zahlen */
      byte b1 = 42;
      short s = 42;
      int i = 42;
      long l = 42;

      /* Gleitkommazahlen */
      float f = 4.99F;
      double d = 4.99;

      /* Zeichen */
      char c1 = 'A';
      char c2 = 65;
      char c3 = '\u0041';
      char c4 = 0b1000001;

      /* Boolscher Wahrheitswert */
      boolean b = true;

      System.out.println("b1: " + b1);
      System.out.println("s: " + s);
      System.out.println("i: " + i);
      System.out.println("l: " + l);
      System.out.println("f: " + f);
      System.out.println("d: " + d);
      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      System.out.println("c4: " + c4);
      System.out.println("b: " + b);
   }

   public static void arithmeticOperators() {
      int result1 = 5 + 3;
      int result2 = 5 - 3;
      int result3 = 5 * 3;
      int result4 = 5 / 3;
      int result5 = 5 % 3;
      double result6 = (double) 5 / 3;

      int c = 0;
      c = c + 1;
      c += 1;
      c++;

      System.out.println("result1: " + result1);
      System.out.println("result2: " + result2);
      System.out.println("result3: " + result3);
      System.out.println("result4: " + result4);
      System.out.println("result5: " + result5);
      System.out.println("result6: " + result6);
   }

   public static void cases() {
      int age = 22;
      char gender = 'w';

      if ((gender == 'm' || gender == 'M') && (age >= 12 && age < 18)) {
         System.out.println("männlicher Teenager");
      } else if (gender == 'w' || gender == 'W') {
         System.out.println("weiblich");
      } else {
         System.out.println("divers oder Junge oder alter Mann");
      }

      String genderText;
      if (gender == 'm') {
         genderText = "männlich";
      } else {
         genderText = "weiblich";
      }
      genderText = gender == 'm' ? "männlich" : "weiblich";
      System.out.println("genderText: " + genderText);

      switch (gender) {
         case 'M':
         case 'm':
            genderText = "männlich";
            break;
         case 'w':
            genderText = "weiblich";
            break;
         default:
            genderText = "divers";
            break;
      }
      System.out.println("genderText: " + genderText);

      genderText = switch (gender) {
         case 'M', 'm' -> "männlich";
         case 'w'      -> "weiblich";
         default       -> "divers";
      };
      System.out.println("genderText: " + genderText);
   }

   public static void loops() {
      int x = 0;
      while (x < 10) {
         System.out.println(x);
         x++;
      }

      x = 0;
      do {
         System.out.println(x);
         x++;
      } while (x < 10);

      for (int i = 0; i < 10; i++) {
         System.out.println(i);
      }
   }

   @SuppressWarnings("unused")
   public static void stringsAndArrays() {
      String input = "Max";

      int length = input.length();
      System.out.println("length: " + length);

      input += ";Lisa;Peter";
      System.out.println("input: " + input);

      String[] names = input.split(";");
      for (int i = 0; i < names.length; i++) {
         String name = names[i];
         System.out.println(i + ": " + name);
      }

      if (input.equals("Max;Lisa;Peter")) {
         System.out.println("gleich");
      }

      int[] numbers = new int[5];
      String[] names2 = {"Hans", "Peter", "Lisa"};
   }

   @SuppressWarnings("resource")
   public static void io() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ganze Zahl eingeben: ");
      int number = scanner.nextInt();
      System.out.print("Kommazahl eingeben: ");
      double fltp = scanner.nextDouble();
      System.out.print("Wahrheitswert eingeben: ");
      boolean boolean1 = scanner.nextBoolean();
      System.out.print("Zeichenkette eingeben: ");
      String string = scanner.next();

      System.out.println(number);
      System.out.println(fltp);
      System.out.println(boolean1);
      System.out.println(string);
   }

}
