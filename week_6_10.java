public class week_6_10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

