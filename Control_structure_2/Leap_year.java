import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scn.nextInt();

        if (year % 400 == 0) {
            System.out.println("It is a leap year.");
        } 
        else if (year % 100 == 0) {
            System.out.println("It is not a leap year.");
        } 
        else if (year % 4 == 0) {
            System.out.println("It is a leap year.");
        } 
        else {
            System.out.println("It is not a leap year.");
        }

        scn.close();
    }
}

