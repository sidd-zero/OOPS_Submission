package P9;
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    double calculateFuelEfficiency() {
        return 0;
    }
    double calculateDistanceTraveled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }
    double getMaxSpeed() {
        return 0;
    }
    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }
}
class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    double calculateFuelEfficiency() {
        return 6.0;
    }
    double getMaxSpeed() {
        return 120.0;
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    double calculateFuelEfficiency() {
        return 15.0;
    }

    double getMaxSpeed() {
        return 180.0;
    }
}
class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    double calculateFuelEfficiency() {
        return 35.0;
    }

    double getMaxSpeed() {
        return 160.0;
    }
}

public class Travel {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "FH16", 2020, "Diesel");
        Car car = new Car("Honda", "Civic", 2022, "Petrol");
        Motorcycle bike = new Motorcycle("Yamaha", "R15", 2023, "Petrol");

        truck.displayDetails();
        System.out.println("Truck Distance (30L): " + truck.calculateDistanceTraveled(30) + " km");
        System.out.println("Truck Max Speed: " + truck.getMaxSpeed() + " km/h\n");

        car.displayDetails();
        System.out.println("Car Distance (30L): " + car.calculateDistanceTraveled(30) + " km");
        System.out.println("Car Max Speed: " + car.getMaxSpeed() + " km/h\n");

        bike.displayDetails();
        System.out.println("Motorcycle Distance (30L): " + bike.calculateDistanceTraveled(30) + " km");
        System.out.println("Motorcycle Max Speed: " + bike.getMaxSpeed() + " km/h");
    }
}
