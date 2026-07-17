import java.util.*;
class NumberOfOccurence
{
    public static void main(String[] args) {
        int arr[]={10,20,30,30,30,30,40,50},target=30;
        int high =UpperBound(arr,target);
        int low= LowerBound(arr,target);
        int ans = high-low;         // very important !!
        System.err.println("the array is: "+Arrays.toString(arr));
        System.err.println("answer: "+ans);
    }
    public static int UpperBound(int[] arr, int target)
    {
       int start=0, end= arr.length-1,position=-1;
        while(start <= end)
        {
            int mid =start + (end-start)/2;
            if(arr[mid]<=target)  
            {
              start=mid+1;
            }
            if(arr[mid]>target)
            {
                position=mid;
                end=mid-1;
            }

        }return position;
    }
    public static int LowerBound(int[] arr, int target)
    {
       int start=0, end= arr.length-1,position=-1;
        while(start <= end)
        { int mid= start+ (end - start)/2;
            if(arr[mid]>=target)
            {
                position=mid;
                end=mid-1;
            }
            if(target>arr[mid])
            {
                start=mid+1;
            }

        }return position;
    }
}