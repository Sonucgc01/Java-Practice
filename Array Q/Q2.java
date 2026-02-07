class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Q2 {
    public static void main(String[] args) {

        // Object creation using constructor
        Student s1 = new Student("sonu", 34);
        Student s2 = new Student("aman", 50);
        Student s3 = new Student("ama", 29);
        Student s4 = new Student("aan", 25);
        Student s5 = new Student("amanew", 29);

        // Display data
        s1.display();
        s5.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
