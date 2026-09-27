class Person{
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class Student extends Person {
    private String major;
    
    public Student(String name, int age, String gender, String major) {
        super(name, age, gender);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "Female", "Computer Science");
        
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Major: " + student.getMajor());
    }
}