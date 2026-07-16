// Problem: Find the 1st repeating element in the array
// Approach: hashmap
// Time Complexity:  O(n)  
// Space Complexity:  O(n)  
// Author: Bhavya


import java.util.*;
class FindFirstRepeatingElementInArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 4, 6};
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : maps.keySet()) {
            if (maps.get(i) == 2) {
                System.err.println("the 1st repeating element is: " + i);
                break;
            }

        }
    }
}
