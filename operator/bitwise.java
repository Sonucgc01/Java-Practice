public class bitwise {
    public static void main(String[] args) {
        
        int a = 10; // binary: 1010
        int b = 5;  // binary: 0101

        System.out.println("a & b = " + (a & b));  // AND
        System.out.println("a ^ b = " + (a ^ b));  // XOR
        System.out.println("~a = " + (~a));        // NOT
        System.out.println("a << b = " + (a << b)); // Left shift
        System.out.println("a >> b = " + (a >> b)); // Right shift
        
    }
}
