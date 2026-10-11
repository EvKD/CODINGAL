class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount;

    // Constructor
    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    // Record a purchase and increase item count
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    // Receive payment
    public void receivePayment(double amount) {
        payment += amount;
    }

    // Give change and reset totals
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }

    // (a) Instance method: get number of purchases
    public int getItemCount() {
        return itemCount;
    }

    // (b) Static method: count total items across registers
    public static int countTotal(CashRegister[] registers) {
        int totalItems = 0;
        for (CashRegister reg : registers) {
            totalItems += reg.getItemCount();
        }
        return totalItems;
    }

    // Display register info
    public String toString() {
        return "Purchase total: $" + purchase + ", Items: " + itemCount;
    }

    // MAIN METHOD to test everything
    public static void main(String[] args) {
        // Create two registers
        CashRegister reg1 = new CashRegister();
        CashRegister reg2 = new CashRegister();

        // Record purchases
        reg1.recordPurchase(10.50);
        reg1.recordPurchase(5.25);
        reg2.recordPurchase(20.00);

        // Show info
        System.out.println("Register 1: " + reg1);
        System.out.println("Register 2: " + reg2);

        // Show item counts
        System.out.println("Items in Register 1: " + reg1.getItemCount());
        System.out.println("Items in Register 2: " + reg2.getItemCount());

        // Count total items across both registers
        CashRegister[] allRegisters = { reg1, reg2 };
        System.out.println("Total items sold: " + CashRegister.countTotal(allRegisters));

        // Example payment and change
        reg1.receivePayment(20.00);
        System.out.println("Change from Register 1: $" + reg1.giveChange());
    }
}
