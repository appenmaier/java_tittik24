package edu.jappuccini.demos.io2;

import lombok.Getter;

/**
 * Model
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Model {

   @Getter
   private String text;

   private static Model instance; // public static final INSTANCE = new Model();

   private Model() {}

   public static Model getInstance() {
      if (instance == null) {
         instance = new Model();
      }
      return instance;
   }

   public void setText(String text) throws InvalidInputException {
      if (text.equals("") || text == null) {
         throw new InvalidInputException();
      }

      if (text.length() > 20) {
         throw new InvalidInputException(text.length());
      }

      this.text = text;
   }

}
