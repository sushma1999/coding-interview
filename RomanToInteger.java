import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
           romanMap.put('I', 1);
           romanMap.put('V', 5);
           romanMap.put('X', 10);
           romanMap.put('L', 50);
           romanMap.put('C', 100);
           romanMap.put('D', 500);
           romanMap.put('M', 1000);
   
           int total = 0;
           int prevValue = 0;
   
           // Check for null or empty string to avoid errors
           if (s == null || s.length() == 0) {
               throw new IllegalArgumentException("Input string cannot be null or empty");
           }
   
           // Iterate over the characters of the Roman numeral string from right to left
           for (int i = s.length() - 1; i >= 0; i--) {
               char currentChar = s.charAt(i);  // Safely access the character
               int currentValue = romanMap.get(currentChar);
   
               // If current value is smaller than the previous value, subtract it; otherwise, add it
               if (currentValue < prevValue) {
                   total -= currentValue;
               } else {
                   total += currentValue;
               }
   
               // Update the previous value to the current one
               prevValue = currentValue;
           }
   
           return total;
       }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        
        // Example 1
        String s1 = "III";
        System.out.println(s1 + " = " + converter.romanToInt(s1)); // Output: 3

        // Example 2
        String s2 = "LVIII";
        System.out.println(s2 + " = " + converter.romanToInt(s2)); // Output: 58

        // Example 3
        String s3 = "MCMXCIV";
        System.out.println(s3 + " = " + converter.romanToInt(s3)); // Output: 1994
    }
}
