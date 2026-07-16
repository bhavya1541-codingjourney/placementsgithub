// Problem: Print count of 0 AND 1 in the array
// Approach: bruteforce  
// Time Complexity:  O(n)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya


class CountNumberOfZerosANDOnes
{
    public static void main(String[] args)
    {   int count0=0,count1=0;
       int arr[]={2,4,2,6,8,0,1,};
       for(int i=0;i<arr.length;i++)
       {
              if(arr[i]==1)
              {
                  count1++;
              }
              if(arr[i]==0)
              {
                count0++;
              }
       }
       System.out.print("Number of zero= "+count0);
       System.out.print("Number of one= "+count1);


   }
    
}