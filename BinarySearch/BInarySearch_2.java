package BinarySearch;

import java.util.Arrays;

public class BInarySearch_2 {
    // Find the target element using binary search in 2d Array
    // Given the array is sorted in row and column manner 
    /*
    {
     {1,5,10,15},
     {2,6,11,16},
     {3,7,12,17},
     {4,8,13,18}
    }
     */
    public static void main(String[] args) {
        int[][] arr={
            {1,5,10,15},
            {2,6,11,16},
            {3,7,12,17},
            {4,8,13,18}
        };
        int ans[]=search(arr,131);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        
        while(r<arr.length && c>=0){
            if(target==arr[r][c]){
                return new int[]{r,c};
            }else if(target>arr[r][c]){
                r++;
            }else c--;
        }

        return new int[]{-1,-1};
    }
}
