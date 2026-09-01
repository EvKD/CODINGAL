import java.util.Scanner;

public class sumtilln {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // What to enter:
        // Enter an integer
        // Programe will calculate: 1 + 2 + 3 + ...+ n
        System.out.print("Enter a number (n): ");

        int n = scn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}