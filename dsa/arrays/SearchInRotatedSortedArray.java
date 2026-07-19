// Problem: Find the target in the rotated sorted array
// Approach: Apply conditions, Binary Search and function calling 
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Author: Bhavya

class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = {50, 60, 70, 10, 20, 30, 40};
        int target = 70;
        if (arr.length == 0) {
            System.err.println("! the array is empty !!");
            System.exit(0);
        }
        int pivotindex = pivot(arr, target);
        int n = arr.length;

        if (target >= arr[0] && target <= arr[pivotindex]) // i was wrong here 
        {
            int start = 0, end = pivotindex;
            boolean search = BinarySearch(arr, start, end, target);
            System.err.println("status: " + search);
        }
        if (target >= arr[pivotindex + 1] && target <= arr[arr.length - 1]) // i was wrong here 
        {
            int start = pivotindex + 1, end = arr.length - 1;
            boolean search = BinarySearch(arr, start, end, target);
            System.err.println("status: " + search);

        } else {
            boolean search = BinarySearch(arr, 0, n - 1, target);
            System.err.println("status: " + search);
        }
    }

    public static int pivot(int[] arr, int target) {
        int start = 0, end = arr.length - 1, position = -1, lastelement = arr[arr.length - 1];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= lastelement) // due to the special case of {-66,-67} so here equal to case should run
            {
                end = mid - 1;
            }
            if (arr[mid] > lastelement) {
                position = mid;
                start = mid + 1;
            }
        }
        return position;
    }

    public static boolean BinarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return false;
    }
}
