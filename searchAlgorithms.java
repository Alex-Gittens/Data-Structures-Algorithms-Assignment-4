import java.util.Scanner;
import java.util.Random;

abstract public class searchAlgorithms {
    
    public static int[] arraysize = new int[40];//array size 

    public static void arrayBuilder(){
        //int[] arraysize = new int[10];
        Random rand = new Random();

        for(int i=0; i < arraysize.length; i++){
            arraysize[i]= rand.nextInt(50);
        }
        System.out.println("Generated Array: ");
        for (int arraysizes : arraysize) {
            System.out.print(arraysizes+" ");
        }
        System.out.println(); // Line break
    }

    public static void mainsearchforsearchL(Scanner input){
        

        input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number You are looking for:");
        int targetnum = input.nextInt();  // Read user input
        //input.close();  // Close the scanner

        searchL(arraysize, targetnum);  // Pass array and target to searchA
        //searchB(arraysize, targetnum);

    }
    public static void mainsearchforsearchB(Scanner input){

        sortingAlgorithms.InsertionSort();
        
        input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Number You are looking for:");
        int targetnum = input.nextInt();  // Read user input
        

        searchB(arraysize, targetnum);  // Pass array and target to searchA
        //searchB(arraysize, targetnum);

    }
    public static int linearSearch(int[] arraysize, int targetnum) {
        
        for (int i = 0; i < arraysize.length; i++) {
            if (arraysize[i] == targetnum) {
                return i;
            } 
        }
        return -1;
    }

    public static int binarySearch(int[] arraysize, int targetnum) {
        //sortingAlgorithms.InsertionSort();
        int left = 0;
        int right = arraysize.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arraysize[mid] == targetnum) {
                return mid;
            }

            if (arraysize[mid] < targetnum) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
        
    }
    public static void searchL(int[] arraysize, int targetnum){
        long startTime= System.nanoTime();//time start

        int resultforsearch = linearSearch(arraysize, targetnum);
        
        long endtime= System.nanoTime(); //time end
        double duration= (endtime - startTime)/1_000_000.0;

        if (resultforsearch != -1) {
            System.out.println("Value " + targetnum + " found at index " + resultforsearch);
            System.out.println("Execution time: " + duration + " ms");//prints out how long it takes
            
        } else {
            System.out.println("Value " + targetnum + " not found");
        }return;
        
    }
    public static void searchB(int[] arraysize, int targetnum){
        long startTime= System.nanoTime();//time start

        int resultforbinary = binarySearch(arraysize, targetnum);

        long endtime= System.nanoTime(); //time end
        double duration= (endtime - startTime)/1_000_000.0;
        
        if (resultforbinary != -1) {
            System.out.println("Value " + targetnum + " found at index " + resultforbinary);
            System.out.println("Execution time: " + duration + " ms");//prints out how long it takes
        } else {
            System.out.println("Target not found in array.");
        }return;        
    }
   
}