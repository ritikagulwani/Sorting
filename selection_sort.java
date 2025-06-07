public class selection_sort{
    public static void sort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            int min=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[min]> arr[j]){ //1 2 3 4 5 
                // if(arr[min]< arr[j]){ //5 4 3 2 1
                    
                    min= j;
                }
            }
            int temp= arr[min];
            arr[min]= arr[turn];
            arr[turn] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sort(arr);
        printArr(arr);

    }
}