import java.util.Arrays;

public class QuickSort {

    // The main function to implement QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array around a pivot and get the pivot index
            int pivotIndex = partition(array, low, high);
    // 2 5 6 7
            // Recursively sort elements before and after the partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partition function that picks the pivot and rearranges the array
    public static int partition(int[] array, int low, int high) {
        // Pivot element (Here we choose the last element as pivot)
        int pivot = array[high];

        // Index of the smaller element (indicates the correct position of the pivot)
        int i = low - 1;

        // Loop to rearrange elements based on the pivot
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap the smaller element with the element at i
                swap(array, i, j);
            }
            System.out.println("Iteration no [j]:"+ j + "value of i:"+ i + " " +Arrays.toString(array));

        }

        // Finally, place the pivot element at the correct position
        swap(array, i + 1, high);

        return i + 1;  // Return the pivot index
    }

    // Swap function to swap two elements in the array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Test array
       // int[] array = {10, 80, 30, 90, 40, 50, 70};
        int[] array = {10, 80, 30, 20, 40 ,60, 50};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Apply QuickSort
        quickSort(array, 0, array.length - 1);

        // Output the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
