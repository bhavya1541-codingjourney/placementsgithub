// Problem: right shift entire array by 1
// Approach: bruteforce  
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya


import java.util.*;
class RightShiftByONE
{
    public static void main(String[] args)
    {
      int arr[]={10,20,30,40,50,60,70};
      int last=arr[arr.length-1];
      for(int i=arr.length-1;i>0;i--)  // most crucial to plan
      {
        arr[i]=arr[i-1];    
      } arr[0]=last;  //  important to keep in mind!!
      System.out.println("the array: "+Arrays.toString(arr));
    }
}