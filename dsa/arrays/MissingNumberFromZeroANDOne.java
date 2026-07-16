// Problem: missing number from 0 to n
// Approach: XOR  
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya


class MissingNumberFromZeroANDOne
{
    public static void main(String[] args)
    {
          int arr[]={2,1,3,5,4,7,0};
          int sum=0,sumrange=0;
          for(int i=0;i<arr.length;i++)
          {
            sum=sum^arr[i];
          }
          for(int i=0;i<=arr.length;i++)
          {
            sumrange=sumrange^i;
          }
          int ans=sumrange^sum;
          System.out.println("answer is: "+ans);
    }
}