class Hillstations {
    void location() {
        System.out.println("Hillstation is located in the mountains.");
    }
    void famousfor() {
        System.out.println("Hillstation is famous for its scenic beauty and cool climate.");
    }
}

class MANALI extends Hillstations {
    void location() {
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }
    void famousfor() {
        System.out.println("Manali is famous for the Hadimba Temple and beautiful landscapes.");
    }
}

class Mussoorie extends Hillstations {
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }
    void famousfor() {
        System.out.println("Mussoorie is famous for the Kempty Falls and scenic views.");
    }
}

class Ooty extends Hillstations {
    void location() {
        System.out.println("Ooty is located in Tamil Nadu, India.");
    }
    void famousfor() {
        System.out.println("Ooty is famous for its botanical gardens and tea plantations.");
    }
}

class hillstation {
    public static void main(String[] args) {
        Hillstations hillstation;

        hillstation = new MANALI();
        hillstation.location();
        hillstation.famousfor();

        hillstation = new Mussoorie();
        hillstation.location();
        hillstation.famousfor();

        hillstation = new Ooty();
        hillstation.location();
        hillstation.famousfor();
    }
}