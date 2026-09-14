import java.util.Scanner;

// Parent class
class Addition {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

// Child class of Addition
class Subtraction extends Addition {
    void subtract(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }
}

// Child class of Subtraction
class Multiplication extends Subtraction {
    void multiply(int a, int b) {
        System.out.println("Product = " + (a * b));
    }
}

// Child class of Multiplication (lowest child)
class Division extends Multiplication {
    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Quotient = " + (a / b));
        else
            System.out.println("Cannot divide by zero!");
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division calc = new Division(); // object of lowest child class

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                calc.add(num1, num2);
                break;
            case 2:
                calc.subtract(num1, num2);
                break;
            case 3:
                calc.multiply(num1, num2);
                break;
            case 4:
                calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
