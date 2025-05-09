package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TableLight extends Light {

   private boolean isConnected;
   // private boolean isOn;
   private LightBulb lightBulb;
   private PlugType plugType;

   public TableLight() {
      plugType = PlugType.TYPE_F;
   }

   public TableLight(LightBulb lightBulb) {
      this.lightBulb = lightBulb;
   }

   public TableLight(String lightBulbColor) {
      lightBulb = new LightBulb(lightBulbColor);
   }

   public void plugIn() {
      isConnected = true;
   }

   public void pullThePlug() {
      isConnected = false;
   }

   // public void switchOn() {
   // isOn = true;
   // }

   // public void switchOff() {
   // isOn = false;
   // }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   @Override
   public boolean isShining() {
      // boolean isShining;
      // if (isConnected == true && isOn == true && lightBulb != null) {
      // isShining = true;
      // } else {
      // isShining = false;
      // }
      // return isShining;
      return isConnected && isOn() && lightBulb != null;
   }

}
