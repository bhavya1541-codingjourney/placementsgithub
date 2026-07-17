import java.util.*;
class BinarySearch
{
    public static void main(String[] args) {
        int arr[]={4,3,2,5,1,7,6},start=0,end=arr.length-1,target=7;
        // 1st we will sort this array
        Arrays.sort(arr);
        System.out.println("the array: "+Arrays.toString(arr));
        while(start<=end)
        {
            int mid=start + (end-start)/2;
            if(arr[mid]==target)
            {
              System.err.println("ELEMENT FOUND: ");
              break;
            }
            if(arr[mid]>target)
            {
               end=mid-1;
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
        }
        // System.out.println("the array: "+Arrays.toString(arr));
    }
}