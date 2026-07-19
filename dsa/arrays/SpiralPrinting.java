// Problem: Print the spiral form of the matrix
// Approach: Brute Force
// Time Complexity: O(rows × columns)
// Space Complexity: O(1)
// Author: Bhavya

class SpiralPrinting {
    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int startrow = 0;
        int endrow = arr.length - 1;
        int startcol = 0;
        int endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // Top Row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            startrow++;

            // Right Column
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            endcol--;

            // Bottom Row
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    System.out.print(arr[endrow][j] + " ");
                }
                endrow--;
            }

            // Left Column
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(arr[i][startcol] + " ");
                }
                startcol++;
            }
        }
    }
}