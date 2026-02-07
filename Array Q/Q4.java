class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Q4 {
    public static void main(String[] args) {

        Employee s1 = new Employee(2001, "Aman", 20000);
        Employee s2 = new Employee(29801, "Sonu", 10000);
        Employee s3 = new Employee(30001, "Ravi", 15000);

        s1.display();
        s2.display();
        s3.display();
    }
}
