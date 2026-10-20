import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter the" + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            int value = scn.nextInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }

        int span = max - min;
        System.out.println("The span of the array is: " + span);
    }
}