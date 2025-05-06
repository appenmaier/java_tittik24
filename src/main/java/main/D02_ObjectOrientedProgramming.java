package main;

import model.LightBulb;
import model.TableLight;

/**
 * Object Oriented Programming
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_ObjectOrientedProgramming {

   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb("red");
      LightBulb blueLightBulb = new LightBulb("blue");

      TableLight light1 = new TableLight();
      System.out.println(light1.isShining());
      light1.plugIn();
      light1.switchOn();
      light1.changeLightBulb(blueLightBulb);
      System.out.println(light1.isShining());
      System.out.println(light1.getLightBulb().getColor());

      TableLight light2 = new TableLight(redLightBulb);
      TableLight light3 = new TableLight("green");

      System.out.println(light1);
      System.out.println(light2);
      System.out.println(light3);
   }

}
