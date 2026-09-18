// Parent class
class Animal {

    // Method
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading:
    // Same method name but different parameters
    void eat() {
        System.out.println("Animal is eating");
    }

    void eat(String food) {
        System.out.println("Animal is eating " + food);
    }
}

// Child class
class Dog extends Animal {

    // Method Overriding:
    // The child class changes the method from the parent class
    @Override
    void sound() {
        System.out.println("Dog says Woof!");
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        // Creating an object of Dog
        Dog myDog = new Dog();

        // Method overriding
        myDog.sound();

        // Method overloading
        myDog.eat();
        myDog.eat("meat");
    }
}