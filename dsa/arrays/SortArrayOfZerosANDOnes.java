// Problem: sort the array of zeros and ones
// Approach: 2 pointers  and swaping 
// Time Complexity:  O(n)  
// Space Complexity:  O(1)  
// Author: Bhavya

import java.util.*;
class SortArrayOfZerosANDOnes
{
    public static void main(String[] args)
    {
        int arr[]={1,0,1,0,0,1,0,0,1};
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            if(arr[start]==1 && arr[end]==0)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;  start++;end--;
            }
            if(arr[start]==0)
            {
              start++;
            }
            if(arr[end]==1)
            {
                end--;
            }
        } System.out.println("the array: "+Arrays.toString(arr));
    }
}