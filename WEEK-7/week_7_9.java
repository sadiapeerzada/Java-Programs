import java.util.Scanner;
public class week_7_9 {
     public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                // sort left side
                quickSort(arr, low, pivotIndex - 1);
                // sort right side
                quickSort(arr, pivotIndex + 1, high);
            }
        }
        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // last element as pivot
            int i = low - 1;       // index of smaller element
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // place pivot in correct position
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            quickSort(arr, 0, n - 1);
            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

        }
    }

