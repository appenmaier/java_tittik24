package edu.jappuccini.demos.io2;

/**
 * InvalidInputException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InvalidInputException extends Exception {

   private static final long serialVersionUID = 1L;

   public InvalidInputException() {
      super("Input is null or empty");
   }

   public InvalidInputException(int length) {
      super("Input is too long (" + length + " characters)");
   }

}
