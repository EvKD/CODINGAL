import java.util.Scanner;

class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        int letters = 0;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                letters++;
            }
        }

        System.out.println("Total number of letters: " + letters);

        input.close();
    }
}
