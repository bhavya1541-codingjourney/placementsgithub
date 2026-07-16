// Problem: find unique element 
// Approach: XOR
// Time Complexity:  O(n)  
// Space Complexity:  O(1)  
// Author: Bhavya

class UniqueElemetInArray_XOR {

    public static void main(String[] args) // this will only work when the duplicates are present in even number of frequency 
    {
        int sum = 0;
        int arr[] = {10, 10, 20, 30, 20, 40, 40};
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
        }
        System.out.println("the unique element is: " + sum);
    }
}
