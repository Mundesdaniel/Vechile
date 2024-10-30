
    class Boat extends Vehicle {
        private double maxKnotsSpeed;
        private int boatKilosWeight;

        public Boat(double maxSpeed, int weight) {
            super("Boat", 0);  // Boats typically don't have wheels
            this.maxKnotsSpeed = maxSpeed;
            this.boatKilosWeight = weight;
        }

        @Override
        public Void doVehicleSound() {
            System.out.println("Boat sound: Splash Splash!");
            return null;
        }

        public String getBoatWeightAndSpeed() {
            return "Boat Weight: " + boatKilosWeight + " kg, Max Knots Speed: " + maxKnotsSpeed + " knots";
        }
    }

