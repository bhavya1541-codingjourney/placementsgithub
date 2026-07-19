// Problem: Find the number of occurence for the target element in the array
// Approach: Apply Binary Search and function calling   answer = Upperbound- LowerBound
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Author: Bhavya

import java.util.*;

class NumberOfOccurence {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 30, 30, 40, 50}, target = 30;
        int high = UpperBound(arr, target);
        int low = LowerBound(arr, target);
        int ans = high - low;         // very important !!
        System.err.println("the array is: " + Arrays.toString(arr));
        System.err.println("answer: " + ans);
    }

    public static int UpperBound(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int position = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                position = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return position;
    }

    public static int LowerBound(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int position = arr.length;   // for some edge cases otherwise i wrote position=-1 in past hahahha!!!

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                position = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return position;
    }
}
