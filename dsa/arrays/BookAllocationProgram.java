// Problem: Book allocation program
// Approach: Apply Binary Search , function calling and some brute force techniques
// Time Complexity: O(n * log(sum))
// Space Complexity: O(1)
// Author: Bhavya


class BookAllocationProgram
{
    public static void main(String[] args) {
        int arr[]={12,34,67,90},sum=0,k=2;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int start=1,end=sum,position=-1;
        while(start<=end)
        {
            int mid=start+(end - start)/2;
            if(isValidAnswer(arr,mid,k))
            {
              position=mid;
              end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println("the minimum of the maximum pages that are assigned to student are: "+position);
    }
    public static boolean isValidAnswer(int[] arr,int mid,int k)  // raw logics 
    {
       // it check if the mid is valid answer or not !!?
       int students =1,sumofpages=0;
       for(int i =0;i<arr.length;i++)
       {
        if(sumofpages + arr[i]<= mid)
        {    // means books can be assigned.
           sumofpages=sumofpages+arr[i];
        }
        else{
            // books cannot be assigned 
            students++;
            if(students>k || arr[i]>mid)
            {
                return false;
            }
            else{   // book assignment for new student !!
                sumofpages=0;
                sumofpages =sumofpages+arr[i];
            }
        }
       } return true;
    }
}