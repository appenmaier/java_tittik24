package main;

import java.util.Optional;
import java.util.Random;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D08_Optionals {

   public static void main(String[] args) {
      /* Ohne Optionals */
      String text = getText();
      if (text != null) {
         System.out.println(text.toUpperCase());
      } else {
         System.out.println("null");
      }

      /* Mit Optionals (imperativ) */
      Optional<String> optional = getOptionalText();
      if (optional.isPresent()) {
         System.out.println(optional.get().toLowerCase());
      } else {
         System.out.println("empty");
      }

      /* Mit Optionals (funktional) */
      optional = getOptionalText();
      optional.ifPresentOrElse(t -> System.out.println(t.toLowerCase()),
            () -> System.out.println("empty"));
   }

   private static String getText() {
      Random random = new Random();
      if (random.nextBoolean()) {
         return "Hello World";
      } else {
         return null;
      }
   }

   private static Optional<String> getOptionalText() {
      Random random = new Random();
      if (random.nextBoolean()) {
         return Optional.of("Hello World");
      } else {
         return Optional.empty();
      }
   }

}
