// Problem: Find the pivot element index in the sorted rotated array
// Approach: Apply Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Author: Bhavya

class FindPivotIndexOfSortedRotatedArray
{
    public static void main(String[] args) {
        int arr[]={50,60,70,90,10,20,30,40,50};
        int start=0,end=arr.length-1,position=-1,lastelement=arr[arr.length-1];
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]<lastelement)
            {
                end=mid-1;
            }
            if(arr[mid]>=lastelement)
            {
                position=mid;
                start=mid+1;
            }
        }System.out.println("the position of the pivot element in array is: "+position);
    }
}