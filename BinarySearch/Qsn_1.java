package BinarySearch;

public class Qsn_1 {

    // Search an element in an infinited sorted array ( AMAZON Interview Question)
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90,123,456,789,1234,5678,8906};
        int ans = infinite(arr, 5678);
        System.out.println(ans);
        
    }

    static int infinite(int[] arr,int target){
        int start=0;
        int end=1;
        
        while(target > arr[end]){
            int temp=end;
            end=start + (end - start +1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start +(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else end=mid-1;
        }
        return -1;
    }
}
