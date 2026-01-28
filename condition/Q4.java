import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your experience: ");
        int exp = sc.nextInt();

        if(age >= 18 && age <= 60) { // valid age
            if(age < 25 && exp < 3) {
                System.out.println("You are a Junior Developer");
            } else if(age >= 25 && exp >= 5) {
                System.out.println("You are a Senior Developer");
            } else {
                System.out.println("Access Restricted");
            }
        } else {
            System.out.println("Access Restricted");
        }

        sc.close();
    }
}
