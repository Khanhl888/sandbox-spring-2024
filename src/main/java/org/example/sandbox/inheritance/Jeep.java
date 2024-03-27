package org.example.sandbox.inheritance;

import java.awt.*;

public class Jeep {
    public class Jeep extends SportUtilityVehicle {

        private Color color;
        protected Double gasMileage;
        @@ -40,4 +40,14 @@ public Double getTowingCapacity() {
            public void setTowingCapacity(Double towingCapacity) {
                this.towingCapacity = towingCapacity;
            }

            @Override
            public int getNumberOfSeats() {
                return numberOfSeats + 1;
            }

            @Override
            public void transport() {

            }
        }