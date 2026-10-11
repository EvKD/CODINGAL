class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void drive() {
        System.out.println("The vehicle is driving...");
    }
}

class Car extends Vehicle {
    private int speed;

    public Car(String brand, int speed) {
        super(brand); // call Vehicle constructor
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " car is driving at " + speed + " km/h.");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic");
        vehicle.drive();

        Car car = new Car("Toyota", 120);
        car.drive();
    }
}
