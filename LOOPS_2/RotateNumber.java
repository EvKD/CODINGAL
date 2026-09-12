import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            String number = input.nextLine();

            System.out.print("Enter the rotate number: ");
            int rotate = input.nextInt();

            String lastPart = number.substring(number.length() - rotate);
            String firstPart = number.substring(0, number.length() - rotate);

            String result = lastPart + firstPart;

            System.out.println("Output: " + result);
        }
    }
}
 
