public class sortingAlgorithms {


    
    //INSERTION SORT code
    public static void InsertionSort(){
        long startTime= System.nanoTime();//time start

        
        int[] arraysize = searchAlgorithms.arraysize; 

        int n = arraysize.length;
        for (int i = 1; i < n; i++) {
            int insertIndex = i;
            int currentValue = arraysize[i];
            int j = i - 1;
            
            while (j >= 0 && arraysize[j] > currentValue) {
                arraysize[j + 1] = arraysize[j];
                insertIndex = j;
                j--;
            }
            arraysize[insertIndex] = currentValue;
        }
        long endtime= System.nanoTime(); //time end
        double duration= (endtime - startTime)/1_000_000.0; //time duration 

        System.out.println("Sorted array: ");
        for (int value : arraysize) {
            System.out.print(value + " ");
        }   
        System.out.println(); 
        System.out.println("Execution time: " + duration + " ms");//prints out how long it takes
        System.out.println(); 

    }
//QUICKSORT CODE
    public static void quicksort(int[] array, int low, int high) {
        
        


        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void quicksorting(){
        long startTime= System.nanoTime();//time start

        searchAlgorithms.arrayBuilder();
        int[] array = searchAlgorithms.arraysize;//calling the array builder 

        quicksort(array,0,array.length-1);//pass the array into the quicksort
        int[] arraysizes = searchAlgorithms.arraysize;

        long endtime= System.nanoTime(); //time end
        double duration= (endtime - startTime)/1_000_000.0;
        

        System.out.println("Sorted array: ");
        for (int value : arraysizes) {
            System.out.print(value + " ");
    }
    //quicksort(null, 0, 0);
        System.out.println(); 
        System.out.println("Execution time: " + duration + " ms");//prints out how long it takes
        System.out.println(); 
}
}
 