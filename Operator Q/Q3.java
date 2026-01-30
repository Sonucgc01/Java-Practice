import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int p = sc.nextInt();


        System.out.println("Enter the second number ");
        
        int q = sc.nextInt();

        
        boolean  ans = !(p < q) || (p % q == 5);
        System.out.println(ans);

    }
}
