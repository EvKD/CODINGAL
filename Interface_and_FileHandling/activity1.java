interface MyInterface 
{
    public void method1();
    public void method2();
}

class activity1 implements MyInterface 
{
    public void method1() 
    {
        System.out.println("Implementation of method 1");
    }
    public void method2() 
    {
        System.out.println("Implementation of method 2");
    }

    public static void main(String[] args) {
        activity1 obj = new activity1();
        obj.method1();
        obj.method2();
    }
}

