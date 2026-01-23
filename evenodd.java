import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = Integer.parseInt(sc.nextLine());

        if (num % 2 == 0) {
            System.out.print(+num + " is the Even number ! ");
        } else {
            System.out.print(+num + " is the Odd number ! ");

        }
    }

}
