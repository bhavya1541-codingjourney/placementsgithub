// Problem: find elements that have highest and lowest frequency in the array
// Approach: hashmaps (hashing)  
// Time Complexity:  O(n)  
// Space Complexity:  O(n)  
// Author: Bhavya

import java.util.*;
class ElementWithHighestAndLowestFrequency
{
    public static void main(String[] args)
    {
        int arr[]={10,20,10,30,20,10,10};
        Map <Integer,Integer> maps= new HashMap<>();

        // frequency counting for each element...
        for(int i=0;i<arr.length;i++)
        {
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);  // curcial line 
        }
                System.out.println("MAP is: "+maps);


        int maxfreq=-1,maxfreqElement=-1;
        for(int i:maps.keySet())
        {
            int currentelement=i;
            int currentfreq=maps.get(i);
            if(maxfreq<currentfreq)      // finding the maxfrequency and maxfrequencyelement
            {
              maxfreq=currentfreq;
              maxfreqElement=currentelement;
            }
        }
        System.out.println("max frequency element is: "+maxfreqElement+"\t with frequency: "+maxfreq);

        
        // now for the lowest frequncy element
        int minfreq=-1,minfreqElement=-1;
        for(int i: maps.keySet())
        {
           int currentelement=i;
            int currentfreq=maps.get(i);
            if(maxfreq>currentfreq)      // finding the maxfrequency and maxfrequencyelement
            {
              minfreq=currentfreq;
              minfreqElement=currentelement;
            }
        }
                System.out.println("min frequency element is: "+minfreqElement+"\t with frequency: "+minfreq);

    }
}