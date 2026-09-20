import java.util.Scanner;

class trycatch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two number: ");
            int E = sc.nextInt();
            int V = sc.nextInt();
            int u = E / V;
            System.out.println(E + " / " + V + " = " + u);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception ex) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}

   