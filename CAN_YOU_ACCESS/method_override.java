class Parent {
    public void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    
    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

class method_override
{
    public static void main(String args[])
    {
       Parent p = new Child();
         p.sayHello();
    }
}
