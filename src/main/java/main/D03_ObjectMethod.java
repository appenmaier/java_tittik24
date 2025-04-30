package main;

import model.LightBulb;

/**
 * Object Method
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_ObjectMethod {

   public static void main(String[] args) {
      LightBulb bulb1 = new LightBulb("red");
      LightBulb bulb2 = new LightBulb("red");

      System.out.println(bulb1);
      System.out.println(bulb2);

      System.out.println(Integer.toHexString(bulb1.hashCode()));
      System.out.println(Integer.toHexString(bulb2.hashCode()));

      System.out.println(bulb1 == bulb2);
      System.out.println(bulb1.equals(bulb2));

      System.out.println(bulb1.getColor());
   }

}
