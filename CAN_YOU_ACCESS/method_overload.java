class Student
{
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    Student(int id, String name, float stipend)
    {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }
        void diplayDetails(){
            System.out.println("ID: " + id + " Name: " + name + " Stipend: " + stipend);
        }
}

// STUDENT

class method_overload
{
    public static void main(String args[])
    {
        Student st1 = new Student(101, "John");
        Student st2 = new Student(102, "David", 1500.50f);
       

        st1.diplayDetails();
        st2.diplayDetails();
    }
}
