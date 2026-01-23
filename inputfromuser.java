import java.util.Scanner;

public class inputfromuser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("name ");
        String name = sc.nextLine();

        System.out.println("age ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("your name is " + name + ", and age is " + num);

    }
}