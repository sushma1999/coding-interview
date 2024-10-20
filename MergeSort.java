public class MergeSort {
    
    public void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted if it has 1 or 0 elements
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        // Copy the elements into left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);
        
        // Recursively split and sort both halves
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted halves
        merge(array, left, right);
    }
    
    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Merge the two arrays while comparing their elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        // Copy remaining elements of left, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        // Copy remaining elements of right, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}