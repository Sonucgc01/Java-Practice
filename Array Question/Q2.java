public class Q2 {

    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 20, 8, 15};

        int max = findMax(arr);
        int min = findMin(arr);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
