public class Q4 {
    
    public static int add(int a, int b){
        return a+b;
    }

public static int sub(int a,int b){
return a-b;
}
public static int mul(int a, int b){
    return a*b;
}

public static int div(int a , int b){
    return a/b;
}

public static void main(String[] args) {
    System.out.println("total number :"+ add(5,2));
    System.out.println("total number :"+ mul(5,2));
    System.out.println("total number :"+ div(5,2));
    System.out.println("total number :"+ sub(5,2));
}
}