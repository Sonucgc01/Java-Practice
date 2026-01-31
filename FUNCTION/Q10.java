public class Q10 {

    public static int calc(int a, int b, char op) {

        if (op == '+') return a + b;
        else if (op == '-') return a - b;
        else if (op == '*') return a * b;
        else if (op == '/') return a / b;

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(calc(6, 3, '+'));
        System.out.println(calc(6, 3, '-'));
        System.out.println(calc(6, 3, '*'));
        System.out.println(calc(6, 3, '/'));
    }
}
