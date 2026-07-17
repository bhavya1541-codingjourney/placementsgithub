import java .util.*;
class SpiralPrinting
{
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int startrow=0,startcol=0,endrow=arr.length-1,endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            for(int j=startcol; j<=endcol;j++)
            {
                System.out.println(arr[startrow][j]);
            }
            startrow++;
            for(int i=startrow;i<=endrow;i++)
            {
                System.out.println(arr[i][endcol]);
            }
            endcol--;
            for(int j=endcol;j>=startcol;j--)
            {
                System.out.println(arr[endrow][j]);
            }
            endrow--;
            for(int i=endrow;i>=startrow;i--)
            {
                System.out.println(arr[i][startcol]);
            }
            startcol++;
        }
    }
}