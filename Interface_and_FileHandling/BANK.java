import java.util.Scanner;

// User-defined exception for invalid menu choice
class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String message) {
        super(message);
    }
}

// User-defined exception for low balance
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class SBI_Banking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Opening balance
            System.out.print("Enter your opening balance: ");
            double balance = sc.nextDouble();

            // Check minimum opening balance
            if (balance < 1000) {
                throw new LowBalanceException(
                        "Opening balance must be at least Rs. 1000.");
            }

            int choice;

            do {
                System.out.println("\n===== SBI BANKING MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                // Check if menu choice is valid
                if (choice < 1 || choice > 4) {
                    throw new InvalidChoiceException(
                            "Invalid choice! Please enter 1, 2, 3 or 4.");
                }

                switch (choice) {

                    case 1:
                        System.out.println("Your balance is Rs. " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();

                        if (deposit <= 0) {
                            throw new Exception(
                                    "Deposit amount must be greater than 0.");
                        }

                        balance = balance + deposit;
                        System.out.println("Money deposited successfully!");
                        System.out.println("New balance: Rs. " + balance);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();

                        if (withdraw > balance) {
                            throw new LowBalanceException(
                                    "Not enough balance to withdraw this amount.");
                        }

                        if (withdraw <= 0) {
                            throw new Exception(
                                    "Withdrawal amount must be greater than 0.");
                        }

                        balance = balance - withdraw;
                        System.out.println("Money withdrawn successfully!");
                        System.out.println("New balance: Rs. " + balance);
                        break;

                    case 4:
                        System.out.println("Thank you for using SBI Banking!");
                        break;
                }

            } while (choice != 4);

        } catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidChoiceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}