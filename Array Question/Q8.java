class Q8_SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        // find max first
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // find second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest element: " + secondMax);
    }
}
