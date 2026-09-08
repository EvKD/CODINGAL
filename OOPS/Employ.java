class Employee {
    int empId;
    String empName;
    float sal;

    Employee() {
        System.out.println("*********");
        empId = 6767;
        empName = "FEDA GOMAN";
        sal = 1000000.0f;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + sal);
    }


} 

class Employ {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}
