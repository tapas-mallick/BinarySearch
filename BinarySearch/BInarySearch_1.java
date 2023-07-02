package BinarySearch;

public class BInarySearch_1 {

    // Find the target element using binary search where you dont know whether the array is sorted ascending or descending
    public static void main(String[] args) {
            int[] arr={4567,1000,500,4000,1,-1};
            //int[] arr={1,2,3,4,5,6,7,8};
            //int[] arr={2,2};
            int ans=search(arr,2);
            System.out.println(ans);
        
    }

    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[0]<arr[arr.length-1];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isAsc){
                if(target==arr[mid]){
                    return mid;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }else end=mid-1;
            }else{
                if(target==arr[mid]){
                    return mid;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return -1;
    }
}
