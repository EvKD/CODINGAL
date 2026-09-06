import java.util.Scanner;

class Primes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of test cases (t): ");
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print(" Enter a number: " + i + ": ");
            int num = scn.nextInt();

            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    break;

                }
        
            }

            if (count == 2) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}



    

