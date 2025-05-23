package edu.jappuccini.demos.io2;

import lombok.Getter;
import lombok.Setter;

/**
 * Model
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Model {

   @Setter
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

}
