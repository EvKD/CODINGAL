class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Activity1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area: " + circle.getArea());
        System.out.println("radius: " + circle.getRadius());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}