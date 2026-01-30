import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number :");

        int b = sc.nextInt();

        int sum1 = (++a + --b);
        int sum2 = (a++ + b--);

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
