package model;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

   private boolean isConnected;
   private boolean isOn;
   private LightBulb lightBulb;

   public boolean isConnected() {
      return isConnected;
   }

   public boolean isOn() {
      return isOn;
   }

   public LightBulb getLightBulb() {
      return lightBulb;
   }

   public void plugIn() {
      isConnected = true;
   }

   public void pullThePlug() {
      isConnected = false;
   }

   public void switchOn() {
      isOn = true;
   }

   public void switchOff() {
      isOn = false;
   }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   public boolean isShining() {
      // boolean isShining;
      // if (isConnected == true && isOn == true && lightBulb != null) {
      // isShining = true;
      // } else {
      // isShining = false;
      // }
      // return isShining;
      return isConnected && isOn && lightBulb != null;
   }

}
