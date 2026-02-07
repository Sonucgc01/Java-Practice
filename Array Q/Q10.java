import java.util.ArrayList;

class Q10 {
    public static void main(String[] args) {

        // 1️⃣ ArrayList create
        ArrayList<Integer> list = new ArrayList<>();

        // 2️⃣ add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("After add(): " + list);

        // 3️⃣ get()
        System.out.println("Element at index 2 = " + list.get(2));

        // 4️⃣ for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }

        // 5️⃣ remove() by index
        list.remove(1);   // index 1 remove (20)
        System.out.println("After remove(index): " + list);

        // 6️⃣ remove() by value
        list.remove(Integer.valueOf(40));
        System.out.println("After remove(value): " + list);

        // 7️⃣ final for-each loop
        System.out.println("Final list:");
        for (int x : list) {
            System.out.println(x);
        }
    }
}
