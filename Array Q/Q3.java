class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Employee s1 = new Employee();
        Employee s2 = new Employee();
        Employee s3 = new Employee();

        s1.id = 2001;
        s1.name = "Aman";
        s1.salary = 20000;

        s2.id = 29801;
        s2.name = "Sonu";
        s2.salary = 10000;

        s3.id = 30001;
        s3.name = "Ravi";
        s3.salary = 15000;

        s1.display();
        s2.display();
        s3.display();
    }
}
