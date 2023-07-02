package BinarySearch;

public class Qsn_7 {
     // search element in Rotated array with duplicate elements using binary Search 
     public static void main(String[] args) {
        int[] arr={3,5,5,1};
        int ans=search(arr,1);
        System.out.println(ans);
    }

    public static int search(int[] nums,int target){
        int pivot = findPivotWithDuplicates(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target==nums[pivot]){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot);
        }else return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    static int binarySearch(int[] arr, int target,int start,int end){

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

    static int findPivotWithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid >start &&arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end -1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }else end=end-1;
        }

        return -1;
    }
}
