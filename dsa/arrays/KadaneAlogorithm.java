// Problem: Print the max sum from the continuous subarray in the array
// Approach: kadane's algorithm
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya

class KadaneAlogorithm          
{
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0,maxsum=Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(maxsum<sum)
            {
                maxsum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.err.println("sum is: "+maxsum);
    }
}