// Problem: Search a target element in the array
// Approach: Sort the array and apply Binary Search
// Time Complexity: O(n log n)
// Space Complexity: O(1)
// Author: Bhavya

import java.util.*;
class BinarySearch
{
    public static void main(String[] args) {
        int arr[]={4,3,2,5,1,7,6},start=0,end=arr.length-1,target=7;
        // 1st we will sort this array
        Arrays.sort(arr);             //  time complexity of this is O(n log n)
        System.out.println("the array: "+Arrays.toString(arr));
        while(start<=end)   // time complexity is O(log n)
        {
            int mid=start + (end-start)/2;
            if(arr[mid]==target)
            {
              System.err.println("ELEMENT FOUND: ");
              break;
            }
            if(arr[mid]>target)
            {
               end=mid-1;
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
        }
        // System.out.println("the array: "+Arrays.toString(arr));
    }
}