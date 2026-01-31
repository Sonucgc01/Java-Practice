

// create a function with para + return + user input


import java.util.Scanner;

public class Q3 {

    // function
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // function call
        int sum = add(x, y);

        System.out.println("Total sum of this: " + sum);

        sc.close();
    }
}
