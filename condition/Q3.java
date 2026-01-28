public class Q3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 8;
        int d = 0;

        // Step 1: Arithmetic + Unary
        a++;             // a = 6
        b = b - 3;       // b = 9
        c = -c;          // c = -8

        // Step 2: Relational + Logical
        boolean result = (a < b && c != 0) || (b % 2 == 1);

        // Step 3: Ternary + Assignment
        d = result ? (a + b * c) : (a - b / 2);

        // Step 4: Bitwise operations
        d = d ^ (a << 2);   // XOR with a shifted left by 2
        d |= 3;             // OR with 3
        d &= ~1;            // AND with NOT 1

        System.out.println("Final value of d: " + d);
    }
}
