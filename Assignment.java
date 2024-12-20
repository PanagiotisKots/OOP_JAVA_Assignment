// The main Vehicle class
class Vehicle {
    private String licenseNumber; // The license plate of the vehicle
    private String model; // The model of the vehicle
    private int year; // The year the vehicle was made

    // Constructor to set up the vehicle details
    public Vehicle(String licenseNumber, String model, int year) {
        this.licenseNumber = licenseNumber;
        this.model = model;
        this.year = year;
    }

    // Method to show the vehicle info
    public void displayInfo() {
        System.out.println("License Number: " + licenseNumber); // Print license number
        System.out.println("Model: " + model); // Print model name
        System.out.println("Year: " + year); // Print the year it was made
    }
}

// The Car class, it’s like Vehicle but has more stuff
class Car extends Vehicle {
    private String fuelType; // What kind of fuel it uses (like gas, diesel, or electric)
    private int seatingCapacity; // How many people can sit in it

    // Constructor to set up the car details
    public Car(String licenseNumber, String model, int year, String fuelType, int seatingCapacity) {
        super(licenseNumber, model, year); // Call the Vehicle constructor
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
    }

    // This shows the car info, including the extra car stuff
    @Override
    public void displayInfo() {
        super.displayInfo(); // Show the common vehicle info
        System.out.println("Fuel Type: " + fuelType); // Print fuel type
        System.out.println("Seating Capacity: " + seatingCapacity); // Print number of seats
    }
}

// The Motorcycle class, it’s a type of Vehicle too
class Motorcycle extends Vehicle {
    private String type; // What type of motorcycle it is
    private int maxSpeed; // How fast it can go

    // Constructor to set up the motorcycle details
    public Motorcycle(String licenseNumber, String model, int year, String type, int maxSpeed) {
        super(licenseNumber, model, year); // Call the Vehicle constructor
        this.type = type; // Set the motorcycle type
        this.maxSpeed = maxSpeed; //>>>>>>>
    }

    // This shows the motorcycle info, including the extra bike stuff
    @Override
    public void displayInfo() {
        super.displayInfo(); // Show the common vehicle info
        System.out.println("Type: " + type); // Print the motorcycle type
        System.out.println("Max Speed: " + maxSpeed + " km/h"); // Print max speed
    }
}

// The Main class where the program starts
public class Main {

    //The main function
    public static void main(String[] args) {
        // Make a Car object
        Car car = new Car("KA12345", "Tesla Model 3", 2022, "Electric", 5);

        // Make a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("MO67890", "Ducati Panigale V4", 2021, "Sport", 300);

        // Print car info
        System.out.println("Car Info:");
        car.displayInfo();
        System.out.println();

        // Print motorcycle info
        System.out.println("Motorcycle Info:");
        motorcycle.displayInfo();
    }
}
