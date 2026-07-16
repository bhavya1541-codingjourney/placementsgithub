// Problem: Print highest element in the array
// Approach: bruteforce  and use of function calling
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya


class HighestInArray
{
    public static int high(int [] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
                 if(arr[i]>max)
                 {
                              max =arr[i];
                 }
        } return max;
    }
    public static void main(String[] args)
    {
        int arr[]={2,6,5,4,8,3,1,99,88};
        int answer=high(arr);
        System.out.println("heighest: "+answer);
    }
}