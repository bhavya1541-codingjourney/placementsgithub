// Problem: Print the sorted array using Bubble Sort
// Approach: Bubble Sort
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Author: Bhavya


import java.util.*;
class BubbleSort
{
    public static void main(String[] args) {
        int arr[]={3,4,2,1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                    {
                        int temp =arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }

            }
        }System.err.println("the sorted array is: "+Arrays.toString(arr));
    }
}