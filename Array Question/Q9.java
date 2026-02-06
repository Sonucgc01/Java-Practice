class Q9_RotateArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Original Array
        System.out.print("Original Array: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();

        // LEFT ROTATE by 1
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.print("Left Rotate: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();

        // RIGHT ROTATE by 1
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.print("Right Rotate: ");
        for (int i : arr) System.out.print(i + " ");
    }
}
