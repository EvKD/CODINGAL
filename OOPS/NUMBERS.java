public class NUMBERS {
    static class Student {
        String name;
        int age;
        int marks;

        // Constructor
        Student(String name, int age, int marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        // Method to display student details
        void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Sam", 15, 95);
        Student student2 = new Student("Tom", 15, 94);
        Student student3 = new Student("John", 15, 93);
        Student student4 = new Student("David", 15, 92);
        Student student5 = new Student("Alex", 15, 91);
        Student student6 = new Student("Ryan", 15, 90);
        Student student7 = new Student("Daniel", 15, 89);
        Student student8 = new Student("James", 15, 88);
        Student student9 = new Student("Harry", 15, 87);
        Student student10 = new Student("Leo", 15, 86);

        student1.showDetails();
        student2.showDetails();
        student3.showDetails();
        student4.showDetails();
        student5.showDetails();
        student6.showDetails();
        student7.showDetails();
        student8.showDetails();
        student9.showDetails();
        student10.showDetails();
    }
}
