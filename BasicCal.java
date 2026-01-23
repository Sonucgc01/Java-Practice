import java.util.Scanner;
public class BasicCal {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean keepRunning = true;

    System.out.print("Enter fisrt number : ");
    int a = Integer.parseInt(sc.nextLine());



    System.out.print("Enter Second number : ");
    int b = Integer.parseInt(sc.nextLine());

     
    int add = (a+b);
    int minus = (a-b);
    int devide =(a/b);
    int multi = (a*b);


    System.out.println(" => Total Plus number is :" + add);
    System.out.println(" => total minus number is :" + minus);
    System.out.println(" => Total Devide number is :" + devide);
    //System.out.println(" => Total  multi number is :" + multi);

    if(b !=0){

        System.out.print("total ")
    }
    }



        
    }
}
