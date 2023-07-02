package BinarySearch;

public class BinarySearch {
    // Find target element in array using binary Search and return the index of target elment
    public static void main(String[] args) {
        int[] arr={-12,12,55,67,89,90,99,290,1000,4567};
        int ans=search(arr,-12);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else end=mid-1;
        }

        return -1;
    }
}
