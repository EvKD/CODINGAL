import java.util.ArrayList;

class Digits {
    private ArrayList<Integer> digitList;

    // Constructor
    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    // Method to display digits
    public void showDigits() {
        System.out.println("Digits: " + digitList);
    }

    // Main method to test
    public static void main(String[] args) {
        Digits d1 = new Digits(12345);
        d1.showDigits();

        Digits d2 = new Digits(0);
        d2.showDigits();
    }
}
