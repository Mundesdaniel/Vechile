//Define an abstract class called Vehicle that has:
//
//a string attribute type
//an int attribute numberOfWheels
//a method showVehicleDetails() that prints in console an informative
// message about the type and the numberOfWheels
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

public abstract class Vehicle {
    private String type;
    private int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }
    public String getType() {
        return type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void showVehicleDetails(){
        System.out.println(getType() + "" + getNumberOfWheels());
    }

    public Void doVehicleSound() {
        System.out.println("This the sound of the car");
        return null;
    }

}
