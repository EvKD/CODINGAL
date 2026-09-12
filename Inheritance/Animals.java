class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring");
    }
}

class BabyLion extends Lion {
    void play() {
        System.out.println("Baby Lion is playing");
    }
}

class Animals {
    public static void main(String[] args) {
        BabyLion bl = new BabyLion();
        bl.eat();
        bl.roar();
        bl.play();
    }
}