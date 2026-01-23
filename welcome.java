import java.util.Scanner;

public class welcome {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your City : ");

    String city = sc.next();
    System.out.println("Welcome, to ! " + city);

  }
}