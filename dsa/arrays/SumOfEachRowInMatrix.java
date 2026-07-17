import java.util.*;
class SumOfEachRowInMatrix
{
    public List<Integer> rowsum() {
        List<Integer> lists = new ArrayList<>();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++)
        { int sumrow=0;
            for(int j=0;j<arr[0].length;j++)
            {
                sumrow=sumrow+arr[i][j];
            }lists.add(sumrow);
        } return lists;
    }
}