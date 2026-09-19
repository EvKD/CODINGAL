abstract class Objects {
    abstract void showshape();
    public void shape() {
        System.out.println("I'm from OBJECTS class");
    }
}

class sphere extends Objects {
    void showshape() {
        System.out.println("I am a sphere");
    }
}

class cuboid extends Objects {
    void showshape() {
        System.out.println("I am a cuboid");
    }
}

class prism extends Objects {
    void showshape() {
        System.out.println("I am a prism");
    }
}

class abstraction {
    public static void main(String[] args) {
        Objects obj;

        obj = new sphere();
        obj.showshape();
        obj.shape();

        obj = new cuboid();
        obj.showshape();
        obj.shape();

        obj = new prism();
        obj.showshape();
        obj.shape();
    }
}