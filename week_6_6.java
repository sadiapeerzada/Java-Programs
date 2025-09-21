public class week_6_6 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 75};
        int key = 45;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
