import java.util.ArrayList;

class Digits {
    
    public static void main(String[] args) {
        Digits digits = new Digits(12345);
        System.out.println(digits.digitList);
    }
    ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num % 10);
            num = num / 10;
        }
    }
}