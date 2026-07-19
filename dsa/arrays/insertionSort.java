// Problem: Print the sorted array using Bubble Sort
// Approach: Insertion Sort
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Author: Bhavya

import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 1};
        
        // Fix 1: Start loop from index 1
        for (int i = 1; i < arr.length; i++) {
            int currentvalue = arr[i];
            int j = i - 1;
            
            // Fix 2: Compare directly with 'currentvalue', not 'arr[currentvalue]'
            while (j >= 0 && arr[j] > currentvalue) {
                arr[j + 1] = arr[j];
                j--;
            } 
            // Fix 3: Assign 'currentvalue' to its correct position
            arr[j + 1] = currentvalue;
        }
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
