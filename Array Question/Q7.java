class Q7_RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray after removing duplicates:");

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if not duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
