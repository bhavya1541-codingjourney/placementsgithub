// Problem: Reverse an array 
// Approach: 2 pointers
// Time Complexity:  O(n)  
// Space Complexity:  O(1)  
// Author: Bhavya


import java.util.*;
class ReverseAnArray
{
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50,60,70};
        int end=arr.length-1;
        for(int i=0 ; i <=arr.length/2;i++)
        {
           int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        } System.out.println("the array: "+Arrays.toString(arr));
    }
}