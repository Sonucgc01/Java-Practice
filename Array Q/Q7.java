import java.util.ArrayList;

class Q7 {
    public static void main(String[] args) {

        ArrayList<Integer> names = new ArrayList<>();

        names.add(12);
        names.add(16);
        names.add(19);
        names.add(16);
        names.add(19);
        names.add(12);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " , " + names.get(i));
        }
    }
}
