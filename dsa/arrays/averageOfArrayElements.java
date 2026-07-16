// Problem: Print average of array elments
// Approach: bruteforce  and use of function calling
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya

class averageOfArrayElements
{
    public static double average(int[] arr)
    { 
        double sum=0.0;
        if(arr.length==0)  // incase of empty array
        {
           return 0.0; 
        }
        for(int i= 0;i<arr.length;i++)
        {
              sum+=arr[i];
        }
        double average=sum/arr.length;
        return average;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        double average=average(arr);
        System.out.println("average: "+average);
    }
}