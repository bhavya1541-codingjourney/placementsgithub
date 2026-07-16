// Problem: search an element in the array
// Approach: bruteforce (linear search)  with the function calling
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya



class LinearSearch
{
    public static  boolean search(int[] arr, int target)
    { 
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==target)
           {
               return true;
           }
        } return false;
    }
    public static void main(String[] args)
    {
        int arr[]={2,1,3,4,3,9};
        int target=9;
        boolean ans= search(arr,target);
        System.out.println("answer is: "+ans);
    }
}
