import java.util.Scanner;

// Parent class
class Shape {
    public double getVolume() {
        return 0;
    }
}

// Cube class
class Cube extends Shape {
    private double side;

    // Constructor
    Cube(double side) {
        this.side = side;
    }

    // Calculate volume
    public double getVolume() {
        return side * side * side;
    }
}

// Cuboid class
class Cuboid extends Shape {
    private double length;
    private double width;
    private double height;

    // Constructor
    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Calculate volume
    public double getVolume() {
        return length * width * height;
    }
}

// Cylinder class
class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Cube
        System.out.print("Enter the side of the cube: ");
        double side = input.nextDouble();

        Cube cube = new Cube(side);
        System.out.println("Volume of cube = " + cube.getVolume() + " cm³");

        // Cuboid
        System.out.print("\nEnter length of cuboid: ");
        double length = input.nextDouble();

        System.out.print("Enter width of cuboid: ");
        double width = input.nextDouble();

        System.out.print("Enter height of cuboid: ");
        double height = input.nextDouble();

        Cuboid cuboid = new Cuboid(length, width, height);
        System.out.println("Volume of cuboid = " + cuboid.getVolume() + " cm³");

        // Cylinder
        System.out.print("\nEnter radius of cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter height of cylinder: ");
        height = input.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume of cylinder = " + cylinder.getVolume() + " cm³");

        input.close();
    }
}