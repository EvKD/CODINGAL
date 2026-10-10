class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", 3, "Golden Retriever");
        Cat c = new Cat("Whiskers", 2, true); 

        System.out.println(d.getName() + " - " + d.getAge() + " years old, Breed: " + d.getBreed());
        d.makeSound();

        System.out.println(c.getName() + " - " + c.getAge() + " years old, Indoor: " + c.isIndoor());
        c.makeSound();
    }
}