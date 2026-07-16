// Problem: find the unique element from the array 
// Approach: hashmap
// Time Complexity:  O(n)  
// Space Complexity:  O(n)  
// Author: Bhavya

import java.util.*;
class UniqueElemetInArray_hashMaps
{
    public static void main(String[] args)
    {
        int arr[]={10,10,20,30,20,40,40};
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i=0; i<arr.length;i++ )    // this approach is best for every case in this question.
        {
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
        }
        for(int i:maps.keySet())
        {
            if(maps.get(i)==1)
             {
                System.out.println("Unique element is: "+i);
             }
            
        }
    }
}