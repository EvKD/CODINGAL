import java.util.Scanner;

class Pick_day {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // What to enter:
        // Enter a number from 1 to 7
        System.out.print("Enter day number (1-7): ");

        int day = scn.nextInt();

        switch (day) {
           
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break; 
            case 6:
                System.out.println("SATURDAY");
                break; 
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("INNCORECT NUMBER BRO");
        }
    }   
}
