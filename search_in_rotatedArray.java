public class search_in_rotatedArray {
//method--1  Iterative method

    public static int search(int[] nums, int target) {
        int idx=0;
        while(idx<=nums.length-1){
            if(nums[idx]== target){
                return idx;                
            }
            idx++;        
        }
        return -1;
    }

// method--2    using binary search

    public static int searchA(int arr[], int target, int st, int end){
        if(st> end){
            return -1;
        }
        
        //mid
        int mid = st +(end-st)/2;
        if(arr[mid]== target){
            return mid;
        }
        // mid on line 1
        if(arr[st]<= arr[mid]){
            if(arr[st]<= target && target<= arr[mid]){
                return searchA(arr, target, st, mid);
            }
            else{
               return searchA(arr, target, mid+1, end);
            }
        }
        //mid on line 2
        else{
            //search on right part
            if(arr[mid]<= target && target<= arr[end]){
                return searchA(arr, target, mid+1, end);
            }
            else{
                //search in left part
                return searchA(arr, target, st, mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2 };
        System.out.println(search(arr, 0));
        System.out.println(searchA(arr, 0, 0, arr.length-1));
    }
}
