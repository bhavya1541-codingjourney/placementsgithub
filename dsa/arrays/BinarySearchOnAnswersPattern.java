// Problem: tell the square root of the number
// Approach: Apply Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Author: Bhavya

class BinarySearchOnAnswersPattern {
    public static void main(String[] args) {

        int number = 56;

        int start = 1;
        int end = number;
        double position = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long square = (long) mid * mid;

            if (square == number) {
                position = mid;
                break;
            }

            if (square > number) {
                end = mid - 1;
            } else {
                position = mid;
                start = mid + 1;
            }
        }

        System.out.println("Square root = " + position);
        double factor=1;
        int totalprecision=3;
        for(int round=1 ; round<= totalprecision;round++)
        {
            factor=factor/10;
            for(int i=1;i<=10;i++)
            {
                double newans = position+factor;
                if(newans* newans == number)
                {
                    System.err.println(newans);
                }
                else if(newans*newans <number)
                {
                    position=newans;
                }
                else{
                    // newans*newans >number
                     break;
                }
            }
        }
        System.err.println("the final answer is: "+Math.round(position*1000.0) / 1000.0);
    }
}