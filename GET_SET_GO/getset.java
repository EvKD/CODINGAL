class Student {
    private String name;

    public String getName() {
        return name;
    }
    
public void setName(String name) {
        this.name = name;
    }
}

class getset {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Evyavan Kaushik");
        System.out.println("Student Name: " + student.getName());
    } 
    
}