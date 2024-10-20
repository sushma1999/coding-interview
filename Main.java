import java.util.HashMap;
import java.util.Map;

class Main{
public static void main(String[] args) {
       //region TWO SUM
        TwoSum sum = new TwoSum();
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sum.twoSum(nums1, target1);
        System.out.println("Example 1: Indices: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sum.twoSum(nums2, target2);
        System.out.println("Example 2: Indices: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = sum.twoSum(nums3, target3);
        System.out.println("Example 3: Indices: [" + result3[0] + ", " + result3[1] + "]");
    
    //endregion
    //region Longest Substring Without Repeating Characters
      // Example 1
      LongestSubstringNonRepeating output = new LongestSubstringNonRepeating();
      String s1 = "abcabcbb";
      int result = output.lengthOfLongestSubstring(s1);
     System.out.println("Example 1: The length of the longest substring without repeating characters is " + result);

   // endregion
   //region Merge Sort
   MergeSort ms = new MergeSort();
   int[] array = {12, 11, 13, 5, 6, 7};
   ms.mergeSort(array);
   
   // Print the sorted array
   System.out.println("Sorted array: ");
   for (int num : array) {
       System.out.print(num + " ");
   }
   //end region
}
}