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

class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    // Constructor for Car
    public Car(int wheels, int doors, double price) {
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors + ", Car Price: $" + carPrice);
    }

    @Override
    public Void doVehicleSound() {
        System.out.println("Car sound: Vroom Vroom!");
        return null;
    }
}
