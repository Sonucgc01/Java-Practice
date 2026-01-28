
// Ek program likho jo user se 3 numbers input le aur decide kare:

// Agar first number > second number aur second number < third number → print "Win"

// Agar first number = third number ya second number > 50 → print "Tie"

// Agar first number < third number aur second number even → print "Lucky"

// Baaki sab ke liye → print "Lose


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

    
        if (num1 > num2 && num2 < num3) {
            System.out.println("Output: Win");
        } else if (num1 == num3 || num2 > 50) {
            System.out.println("Output: Tie");
        } else if (num1 < num3 && num2 % 2 == 0) {
            System.out.println("Output: Lucky");
        } else {
            System.out.println("Output: Lose");
        }

        sc.close();
    }
}
