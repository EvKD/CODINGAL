abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void drive();
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    public int getNumDoors() {
        return numberOfDoors;
    }
}

class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Mc Larren", "720s", 2017, 2);
        Vehicle myTruck = new Truck("Ford", "F-150", 2019, 1000.0);

        myCar.drive();
        myTruck.drive();
    }
}