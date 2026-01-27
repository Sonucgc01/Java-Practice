public class unary {
    public static void main(String[] args) {

        // 1️⃣ Increment ++
        int a = 5;
        System.out.println("Original a: " + a);

        System.out.println("Pre-increment ++a: " + (++a)); // a=6 pehle increment fir print
        System.out.println("Post-increment a++: " + (a++)); // print a=6 pehle fir increment
        System.out.println("After post-increment a: " + a); // a=7

        // 2️⃣ Decrement --
        int b = 5;
        System.out.println("\nOriginal b: " + b);

        System.out.println("Pre-decrement --b: " + (--b)); // b=4
        System.out.println("Post-decrement b--: " + (b--)); // print b=4, fir b=3
        System.out.println("After post-decrement b: " + b); // b=3

        // 3️⃣ Unary Plus +
        int c = 10;
        int d = +c; // simply value positive
        System.out.println("\nUnary plus +c: " + d); // 10

        // 4️⃣ Unary Minus -
        int e = 10;
        int f = -e; // value ka sign negative
        System.out.println("Unary minus -e: " + f); // -10

        // 5️⃣ Logical NOT !
        boolean isRaining = true;
        System.out.println("\nOriginal isRaining: " + isRaining);
        System.out.println("Logical NOT !isRaining: " + (!isRaining)); // false

    }
}
