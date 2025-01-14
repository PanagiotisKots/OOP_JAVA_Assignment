// The main Vehicle class
class Vehicle {
    private String licenseNumber;
    private String model; 
    private int year; 

    // Constructor of vehicle
    public Vehicle(String licenseNumber, String model, int year) {
        this.licenseNumber = licenseNumber;
        this.model = model;
        this.year = year;
    }

    // method that displays vehicle informtion
    public void displayInfo() {
        System.out.println("License Number: " + licenseNumber); 
        System.out.println("Model: " + model); 
        System.out.println("Year: " + year); 
    }
}

// the Car class
class Car extends Vehicle { //inherits from vehicle class
    private String fuelType; 
    private int seatingCapacity; 

    // constructor for car class
    public Car(String licenseNumber, String model, int year, String fuelType, int seatingCapacity) {
        super(licenseNumber, model, year); // call the Vehicle constructor
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
    }

    // car information printing
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Fuel Type: " + fuelType); 
        System.out.println("Seating Capacity: " + seatingCapacity); 
    }
}

// the motorcycle class
class Motorcycle extends Vehicle { //inherits from vehicle
    private String type; 
    private int maxSpeed; 

    // constructor for motorcycle
    public Motorcycle(String licenseNumber, String model, int year, String type, int maxSpeed) {
        super(licenseNumber, model, year); // Call the Vehicle constructor again
        this.type = type; 
        this.maxSpeed = maxSpeed; 
    }

    // inforation printing
    @Override
    public void displayInfo() {
        super.displayInfo(); // Show the common vehicle info
        System.out.println("Type: " + type); 
        System.out.println("Max Speed: " + maxSpeed + " km/h"); 
    }
}

// The Main class where the program starts
public class Main {

    //The main function
    public static void main(String[] args) {
        // create a car object
        Car carTesla = new Car("KA12345", "Tesla Model 3", 2022, "Electric", 5);

        // the same way create a motorcycle object
        Motorcycle motorcycleDucati = new Motorcycle("MO67890", "Ducati Panigale V4", 2021, "Sport", 300);

        // Print car info
        System.out.println("Car Info:");
        carTesla.displayInfo();
        
        System.out.println();

        // Print motorcycle info
        System.out.println("Motorcycle Info:");
        motorcycleDucati.displayInfo();
    }
}
