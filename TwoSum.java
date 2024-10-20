import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that adds up to the target
            int complement = target - nums[i];
            
            // If the complement is found in the map, return the indices
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Otherwise, store the number and its index in the map
            numMap.put(nums[i], i);
        }
        
        // In case no solution is found, throw an exception (though the problem guarantees one solution)
        throw new IllegalArgumentException("No two sum solution");
    }
}


