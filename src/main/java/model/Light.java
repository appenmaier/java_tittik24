package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString
@EqualsAndHashCode
public abstract class Light {

   private boolean isOn;

   public void switchOn() {
      isOn = true;
   }

   public void switchOff() {
      isOn = false;
   }

   public abstract boolean isShining();

}
