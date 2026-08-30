import java.util.Scanner;

public class Hello_user {
    

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            System.out.print("enter a string:");
            String str = scn.nextLine();
            System.out.println("The string is "+ str);

            System.out.print("enter a integer number:");
            int num = scn.nextInt();
            System.out.println("Number is " + num);

            System.out.print("enter a floating number: ");
            float fnum = scn.nextFloat();
            System.out.println("The flating number is " + fnum);

            scn.close();
        }

}
