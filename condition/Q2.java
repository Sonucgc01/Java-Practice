
// Write a Java program that:

// Asks the user to enter their age (integer).

// Asks the user if they have a Voter ID (true or false).
import java.util.Scanner;
class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have Voter ID (true/false): ");
        boolean hasVoterId = sc.nextBoolean();

        if (age >= 18 && hasVoterId) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }

        sc.close();
    }
}
