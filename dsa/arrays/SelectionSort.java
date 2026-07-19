// Problem: Print the sorted array using Bubble Sort
// Approach: Selection Sort
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Author: Bhavya

import java.util.*;
class SelectionSort
{
    public static void main(String[] args) {
        int arr[]={3,4,2,1};System.err.println("the original array: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {   int small=i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        } System.err.println("the sorted array: "+Arrays.toString(arr));
    }
}