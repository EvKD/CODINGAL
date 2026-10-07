class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount;

    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }

    public int getItemCount() {
        return itemCount;
    }

    public static int countTotal(CashRegister[] registers) {
        int total = 0;
        for (CashRegister reg : registers) {
            total += reg.getItemCount();
        }
        return total;
    }

    public String toString() {
        return "Purchases: " + itemCount + ", Total: $" + purchase;
    }
}

public class Main {
    public static void main(String[] args) {
        CashRegister reg1 = new CashRegister();
        reg1.recordPurchase(10.0);
        reg1.recordPurchase(5.0);
        reg1.receivePayment(20.0);
        System.out.println("Change: $" + reg1.giveChange());

        CashRegister reg2 = new CashRegister();
        reg2.recordPurchase(7.0);
        reg2.recordPurchase(3.0);

        CashRegister[] registers = { reg1, reg2 };
        System.out.println("Total items sold: " + CashRegister.countTotal(registers));
    }
}
