public class bubble_sort{
    public static void bubble_sort(int arr[]){
        int swap=0;
         for(int turn= 0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }
                
            }
            
         }
        if(swap==0){
             System.out.println("Array is already sorted");
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,7,9,10};
        bubble_sort(arr);
        printArr(arr);

    }
}