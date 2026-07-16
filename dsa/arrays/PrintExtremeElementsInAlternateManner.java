// Problem: Print extreme elements in alternate manner
// Approach: 2 pointers
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya
class PrintExtremeElementsInAlternateManner
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        int start=0,end=arr.length-1;
        while(start<=end)           // 2 pointers
        {
           System.out.print(arr[start]+" ");
           start++;
           System.out.print(arr[end]+" ");
           end--;
        }
    }
}