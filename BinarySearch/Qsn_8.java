package BinarySearch;

public class Qsn_8 {

    // Count of Rotation in a rotated sorted array
    public static void main(String[] args) {
        int[] arr={5,6,7,7,8,8,0,1};
        int ans=findPivotWithDuplicates(arr);
        System.out.println(ans+1);
    }

    static int findPivot(int[] arr){
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

            if(arr[mid] <=arr[start]){
                end=mid-1;
            }else start=mid+1;
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
