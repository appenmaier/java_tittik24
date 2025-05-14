package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Toaster
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString
@EqualsAndHashCode
public class Toaster implements WiredDevice, Comparable<Toaster> {

   private boolean isConnected;
   private int slots;

   public Toaster(int slots) {
      this.slots = slots;
   }

   @Override
   public void plugIn() {
      isConnected = true;
   }

   @Override
   public void pullThePlug() {
      isConnected = false;
   }

   @Override
   public int compareTo(Toaster otherToaster) {
      return Integer.compare(slots, otherToaster.slots);
   }

}
