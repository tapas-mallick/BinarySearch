package BinarySearch;

public class Qsn_4 {

    // Find the Peak index in a mountain array using binary search
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,100,200,11,0};
        int ans = peak(arr);
        System.out.println(ans);
    } 

    static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid= start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else start=mid+1;
        }
        return start;
    }
}
