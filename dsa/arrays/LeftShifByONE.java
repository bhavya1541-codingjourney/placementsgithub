// Problem: Left  shift entire array by 1
// Approach: bruteforce  
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya

import java.util.*;
class LeftShifByONE
{
    public static void main(String[] args)
    {
          int arr[]={10,20,30,40,50,60,70}; int temp =arr[0];
          for(int i=0;i<arr.length-1;i++)
          {
               arr[i]=arr[i+1];
          }  arr[arr.length-1]=temp;
          System.out.println("the array is: "+Arrays.toString(arr));
    }
}