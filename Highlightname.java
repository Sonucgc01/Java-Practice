import java.util.Scanner;
public class Highlightname {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter you Full Name : ");
    String name = sc.next();

    char lastchar = name.charAt(3);
    System.out.println("you get , : " + lastchar +" : Of your name");

}
}
