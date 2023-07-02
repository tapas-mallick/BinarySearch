package BinarySearch;

public class Qsn_5 {
    // Find Duplicate element and return the index in a mountain array
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,4,2,1};
        int ans=index(arr,2);

        System.out.println(ans);
    }

    static int index(int[] arr,int target){
        int peak=mountain(arr);
        int ans =search(arr,target,0,peak);
        int ans2=search(arr,target,peak,arr.length-1);

        if(ans==ans2){
            return ans;
        }
        if(ans<ans2){
            return ans;
        }else return ans2;
    }


    
    static int mountain(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else start=mid+1;
        }

        return start;
    }

    static int search(int[] arr, int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];

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
