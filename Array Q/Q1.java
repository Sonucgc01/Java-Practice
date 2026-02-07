class Student {
    String name;
    int age;
}


    public class Q1 {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student();
           
            s1.name = "aman :";
            s1.age = 20;
            s2.name = "sonu: ";
            s2.age = 34;
            
           
            // Access object properties
            System.out.println(s1.name + " " + s1.age);
            System.out.println(s2.name + " " + s2.age);
        }
    }

