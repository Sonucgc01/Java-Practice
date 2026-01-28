
// Company me employees ko bonus assign karna hai based on age, experience, aur performance score.
// Employee ka age 20 se 60 ke beech hona chahiye.

// Employee ka experience >= 3 years hona chahiye.

// Employee ka performance score >= 80 hai toh High Bonus milega.

// Agar performance score >= 60 aur experience >= 5, toh Medium Bonus milega.

// Baaki sab ke liye No Bonus milega.



import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your experience: ");
        int exp = sc.nextInt();

        System.out.print("Enter your performance score: ");
        int performance = sc.nextInt();

        if(age >= 20 && age <= 60) { // valid age
            if(exp >= 3) { // minimum experience
                if(performance >= 80) {
                    System.out.println("Bonus: High Bonus");
                } else if(performance >= 60) {
                    System.out.println("Bonus: Medium Bonus");
                } else {
                    System.out.println("Bonus: No Bonus");
                }
            } else {
                System.out.println("Bonus: No Bonus (Insufficient Experience)");
            }
        } else {
            System.out.println("Bonus: No Bonus (Invalid Age)");
        }

        sc.close();
    }
}
