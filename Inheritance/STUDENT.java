class Parent {
    int age, id;
    String name;

    void naming(String name) {
        System.out.println("My name is " + name);
    }
} 

class Child extends Parent {
    void ageN(int age) {
        System.out.println("My age is " + age);

        } 
    }



    class student {
        public static void main(String[] args) {
            Child c = new Child();
            c.naming("Evyavan Kaushik");
            c.ageN(20);
        }
    }