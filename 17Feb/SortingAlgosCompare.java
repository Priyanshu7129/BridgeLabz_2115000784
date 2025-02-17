public class SortingAlgosCompare {   
    public static void timeTaken(int size) {
        
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = i;
        
        long startTime = System.nanoTime();
        bubbleSort(arr);

        System.out.println(
                "Bubble Sort: " + (System.nanoTime() - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sort: "+ (System.nanoTime() - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + (System.nanoTime() - startTime) / 1000000.0 + " ms");
        
    }
    
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean isSwapped = false;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
                
            }
            if (!isSwapped)
            break;
            
        }
        
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        
        if (left >= right)
        return;
        
        int mid = (left + right) / 2;
        
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        
        merge(arr, left, mid, right);

    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        
        int[] l = new int[mid - left + 1];
        int[] r = new int[right - mid];
        
        int li = 0, ri = 0;
        for (int i = left; i <= mid; i++)
            l[li++] = arr[i];
        for (int i = mid + 1; i <= right; i++)
            r[ri++] = arr[i];
            
            li = 0;
            ri = 0;
            int in = 0;
            
        while (li < l.length && ri < r.length) {
            
            if (l[li] <= r[ri])
                arr[in++] = l[li++];
            else
                arr[in++] = r[ri++];

        }
        
        while (li < l.length)
            arr[in++] = l[li++];
        while (ri < r.length)
            arr[in++] = r[ri++];
        
    }
    
    public static void quickSort(int[] arr, int left, int right) {
        
        if (left >= right)
        return;

        int ind = partition(arr, left, right);
        
        quickSort(arr, left, ind - 1);
        quickSort(arr, ind + 1, right);
        
    }
    
    public static int partition(int[] arr, int left, int right) {
        
        int idx = left;
        
        for (int i = left; i < right; i++) {
            
            if (arr[right] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
            
        }
        int temp = arr[idx];
        arr[idx] = arr[right];
        arr[right] = temp;
        
        return idx;
        
    }
    
    public static void main(String[] args) {
    
        System.out.println("For N = 1000:");
        timeTaken(1000);

        System.out.println("For N = 10000:");
        timeTaken(10000);

        System.out.println("For N = 1000000:");
        timeTaken(1000000);
    
    }
}
