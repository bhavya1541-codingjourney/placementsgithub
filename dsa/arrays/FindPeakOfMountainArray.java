// Problem: Search index of the peak element in the array 
// Approach: Apply Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Author: Bhavya

class FindPeakOfMountainArray
{
   public static void main(String[] args) {
       int arr[]={0,2,1,4,5,3,1};
       int start=0,end=arr.length-1,position=-1;
       while(start<=end)
       {
        int mid=start+ (end-start)/2;
        if(arr[mid]>=arr[mid+1])
        {
           position=mid;
           end=mid-1;
        }
        if(arr[mid]<arr[mid+1])
        {
            start=mid+1;
        }
       } System.err.println("peak of this array is present at index: "+position);
    }
}