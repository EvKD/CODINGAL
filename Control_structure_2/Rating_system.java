public class Rating_system {
    public static void main(String[] args) {
        int rating = 4;

        switch (rating) {
            case 1:
                System.out.println("Very Bad");
                break;
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid rating");
        }
    }
}