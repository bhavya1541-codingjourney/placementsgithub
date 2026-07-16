// Problem: find unique element in array 
// Approach: bruteforce
// Time Complexity:  O(n square)  
// Space Complexity:  O(1)  
// Author: Bhavya

import java.util.Arrays;
class UniqueElemetInArray_bruteforce
{
    public static void main(String[] args)
    {
        int arr[]={10,10,20,30,20,40,40};
         System.out.println("the array is: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {   int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println("unique element is: "+arr[i]);
            }
        }
    }
}