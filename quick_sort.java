public class quick_sort {
//Note-- quick sort main worst case time complexity O(N^2) haoti hai or vo tab hoti hai jab array already assecending or decending order main sorted hota hai kyoki tab pivot smallest ya largest no hota hai already 
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void sort(int arr[], int st, int end) {
        // base case

        if (st >= end)
            return;

        // pivot-- Last element
        int pivot_idx = partition(arr, st, end);
        sort(arr, st, pivot_idx - 1); // left part
        sort(arr, pivot_idx + 1, end);
    }

    public static int partition(int arr[], int st, int end) {
        int pivot = arr[end];
        int i = st - 1;// jagah bnaayga smaller element k liye pivot se
        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[end] = arr[i];// pivot nahi likhna kyoki vo variable hai
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
