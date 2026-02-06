import java.util.Arrays;

class Q6 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 43, 54, 67, 35, 76};

        // Ascending Sort
        Arrays.sort(arr);
        System.out.println("Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // Descending Sort
        System.out.println("\nDescending Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
