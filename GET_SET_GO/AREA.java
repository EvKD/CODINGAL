class SHAPE {
    public double getArea() {
        return 0;
   }
}

class Triangle extends SHAPE {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double getArea() {
        return 0.5 * base * height;
    }
}

class square extends SHAPE {
    private double side;

    public square(double side) {
        this.side = side;
    }

    
    public double getArea() {
        return side * side;
    }
}
class AREA {
   
    public static void main(String[] args) {
        SHAPE[] shapes = new SHAPE[2];

        shapes[0] = new Triangle(5, 10);
        shapes[1] = new square(4);

        System.out.println("Area of Triangle: " + shapes[0].getArea());
        System.out.println("Area of Square: " + shapes[1].getArea());
    }
}