import java.util.Scanner;

public class rating {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        // What to enter:
        // Enter a number from the list: 5000, 25000, 45000, 75000
        System.out.print("Enter a rating number (5000, 25000, 45000, 75000): ");
        int rating = scn.nextInt();
        


        switch (rating) {
            case 5000:
                System.out.println("This movie is Good");
                break;
            case 25000:
                System.out.println("This movie is Great");
                break;
            case 45000:
                System.out.println("This movie is the Best");
                break;
            case 75000:
                System.out.println("This movie is OUT OF THIS WORLD");
                break;
        }
    }
}
