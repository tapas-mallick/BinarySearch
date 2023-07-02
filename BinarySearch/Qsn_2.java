package BinarySearch;

public class Qsn_2 {
    //Find ceiling of the target element in a sorted array
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90,123,456,789,1234,5678,8906};
        int ans = ceiling(arr, 10000);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+(end-start)/2;
            if(target == arr[mid]){
                return mid +1;
            }

            if(target > arr[mid]){
                start=mid+1;
            }else end = mid-1;
        }
        return start;
    }
}
