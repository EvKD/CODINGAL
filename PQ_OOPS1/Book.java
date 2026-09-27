class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String t, String a, int np) {
        title = t;
        author = a;
        numPages = np;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public int getNumPages() {
        return numPages;
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String E, int V, String U) {
        name = E;
        age = V;
        gender = U;
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

class Student extends Person {
    private String major;

    public Student(String name, int age, String gender, String major) {
        super(name, age, gender);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

class BookMain {
    public static void main(String[] args) {
        Student student = new Student("Seamus Finnigan", 11, "Male", "Magic Studies");
        
        Book book = new Book("Harry Potter", "J.K. Rowling", 128);
    
    System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());

        System.out.println("Book's Information:");
        System.out.println("Name:" + book.getTitle());
        System.out.println("Author:" + book.getAuthor());
        System.out.println("Pages:" + book.getNumPages());

    }
}