package BinarySearch;

import java.util.Arrays;

public class BinarySearch_3 {

    //Find the target element in sorted matrix
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
           };
        int[] ans = search(arr,4);
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] search(int[][] arr,int target){
        int row =arr.length;
        int cols=arr[0].length;

        if(row==1){
            return BinarySearch(arr,0,0,cols-1,target);
        }
        //Run the loop till two rows will remaining
        int rStart=0;
        int rEnd=row-1;
        int cMid=cols/2;

        while(rStart<rEnd-1){
             int mid=rStart+(rEnd-rStart)/2;

            if(target == arr[mid][cMid]){
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid]<target){
                rStart= mid;
            }
            if(arr[mid][cMid]>target){
                rEnd= mid;
            }
        }

        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        if(target<=arr[rStart][cMid-1]){
            return BinarySearch(arr, rStart, 0, cMid-1, target);
        }
        
        if(target<=arr[rStart+1][cMid-1] && target >= arr[rStart+1][0]){
            return BinarySearch(arr, rStart+1, 0, cMid-1, target);
        }
        
        if(target>=arr[rStart][cMid+1] && target <=arr[rStart][arr[rStart].length-1]){
            return BinarySearch(arr, rStart, cMid+1, arr[rStart].length-1, target);
        }
        
        if(target>=arr[rStart+1][cMid+1]){
            return BinarySearch(arr, rStart+1, cMid+1, arr[rStart+1].length-1, target);
        }
        return new int[]{-1,-1};
    }

    // Binary search in the privided row within a particular start and end point

    static int[] BinarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;

            if(target==arr[row][mid]){
                return new int[]{row,mid};
            }
            else if(target > arr[row][mid]){
                cStart=mid+1;
            }else cEnd=mid-1;
        }
        return new int[]{-1,-1};
    }
}
