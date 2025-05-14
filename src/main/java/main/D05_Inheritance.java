package main;

import java.util.ArrayList;
import java.util.List;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Inheritance
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D05_Inheritance {

   public static void main(String[] args) {
      /* Ohne Vererbung */
      List<TableLight> tableLights = new ArrayList<>();
      tableLights.add(new TableLight());
      tableLights.add(new TableLight());

      List<FlashLight> flashLights = new ArrayList<>();
      flashLights.add(new FlashLight());
      flashLights.add(new FlashLight());

      for (TableLight t : tableLights) {
         t.switchOn();
         System.out.println(t.isShining());
      }

      for (FlashLight f : flashLights) {
         f.switchOn();
         System.out.println(f.isShining());
      }

      /* Mit Vererbung */
      List<Light> lights = new ArrayList<>();
      lights.add(new FlashLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast

      for (Light l : lights) {
         l.switchOn(); // Dynamische
         if (l instanceof TableLight t) { // impliziter Dowqncast
            // TableLight t = (TableLight) l; // expliziter Downcast
            t.plugIn();
            t.changeLightBulb(new LightBulb("red"));
         }
         System.out.println(l.isShining()); // Statische + Dynamische Polymorphie
      }
      System.out.println(lights);

      /* Abstrakt und Final */
      // Light light = new Light();

      /* Interfaces */
      List<WiredDevice> wiredDevices = new ArrayList<>();
      wiredDevices.add(new Toaster(2)); // Upcast
      wiredDevices.add(new TableLight()); // Upcast

      for (WiredDevice d : wiredDevices) {
         d.plugIn(); // Dynamische Polymorphie
         if (d instanceof TableLight t) { // Downcast
            t.switchOn();
         }
         System.out.println(d);
      }
   }

}
