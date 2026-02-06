public class Q4 {

    static double findAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        double avg = findAverage(arr);

        System.out.println("Average of array: " + avg);
    }
}
