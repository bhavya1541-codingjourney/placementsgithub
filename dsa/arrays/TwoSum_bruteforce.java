// Problem: 2 sum bruteforce
// Approach: bruteforce
// Time Complexity:  O(nsquare)  
// Space Complexity:  O(1) no extra space taken 
// Author: Bhavya

class TwoSum_bruteforce {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                    break;
                }
            }
        }
    }
}
