public class merge_sort {
    public static void sort(int arr[], int st, int end) {
        // base case
        if (st >= end) {
            return;
        }
        // recursive work
        int mid = st + (end - st) / 2;
        sort(arr, st, mid);// left part
        sort(arr, mid + 1, end); // right part
        // self work
        merge(arr, st, mid, end);
    }

    public static void merge(int arr[], int st, int mid, int end) {
        // left =(0,3) 4 , right =(4,6)3 --> 6-0+1=7
        int temp[] = new int[end - st + 1];
        int i = st;// left ke liye iterator
        int j = mid + 1;// for right
        int k = 0; // temp arr ke liye
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;             
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left main kuch bcha hai toh uske liye
        while(i<=mid){
            temp[k++]= arr[i++];
        }
        //right k liye
        while(j<= end){
            temp[k++]= arr[j++];
        }
        //temp to original array copy
        for(k=0,i=st;k<temp.length;k++,i++){
           arr[i]= temp[k];
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}