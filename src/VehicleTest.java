//Define an abstract class called Vehicle that has:
//
//a string attribute type
//an int attribute numberOfWheels
//a method showVehicleDetails() that prints in console an informative message about the type and the numberOfWheels
//an abstract method doVehicleSound()
//define a subclass Car of Vehicle that has:
//an int attribute numberOfDoors
//a double attribute carPrice
//an override of the superclass method showVehicleDetails() that:
//recalls the super method showVehicleDetails()
//prints in console an informative message about the car's numberOfDoors
//a mandatory override of the abstract method doVehicleSound() where you print the car's sound
//a constructor method that:
//accepts 3 params (wheels, doors, price)
//assign the correct values to type, numberOfWheels, numberOfDoors and carPrice
//define a subclass Boat of Vehicle that has:
//a double attribute maxKnotsSpeed
//an int attribute boatKilosWeight
//a mandatory override of the abstract method doVehicleSound() where you print the boat's sound
//a constructor method that:
//accepts 2 params (maxSpeed, weight)
//assign the correct values to type, maxKnotsSpeed and boatKilosWeight
//a method getBoatWeightAndSpeed that returns an informative String about the total kilos weight and the maximum knots speed
//define a tester class where you:
//create a Car object and a Boat object
//invoke the two Vehicle methods for the newly created Car and Boat objects
//print in console the Boat weight and speed using the dedicated method.



public class VehicleTest {
    public static void main(String[] args) {
        // Create Car and Boat objects
        Car car = new Car(4, 4, 20000.0); // 4 wheels, 4 doors, price $20,000
        Boat boat = new Boat(30.5, 1500); // max speed 30.5 knots, weight 1500 kilos

        // Invoke Vehicle methods for Car and Boat
        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println(); // For better readability

        boat.showVehicleDetails(); // Note: This method is not overridden, it will show generic details
        boat.doVehicleSound();

        // Print Boat weight and speed
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
