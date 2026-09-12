class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

// child class
class Dog extends Mammals {
    void dog() {
        System.out.println("Inside Dog Class");
    }
}

//child
class Human extends Mammals {
    void human() {
        System.out.println("Inside Human Class");
    }
}

class mammalsmain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.mam();
        d.dog();

        Human h = new Human();
        h.mam();
        h.human();
    }
}