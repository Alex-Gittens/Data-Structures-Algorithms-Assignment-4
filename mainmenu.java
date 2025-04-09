import java.util.Scanner;

class mainmenu {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            // Menu options
            System.out.println("\n=== MENU ===");
            System.out.println("1. Generate Random Array");
            System.out.println("2. Linear Search for your a Number:");
            System.out.println("(make a random Array for 2.Linear Search)");
            System.out.println("3. Binary Search for your a Number:");
            System.out.println("4. Sort a Random Array using Insertion Sort");
            System.out.println("5. Sort a Random Array using Quick Sort");
            System.out.println("6. Hash Table Example:");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    searchAlgorithms.arrayBuilder();
                    break;

                case 2:    
                    if (searchAlgorithms.arraysize == null) {
                    System.out.println("⚠️ Please generate the array first (Option 1).");
                }   else {
                    searchAlgorithms.mainsearchforsearchL(input);
                }
                break;

                case 3:
                    if (searchAlgorithms.arraysize == null) {
                    System.out.println("⚠️ Please generate the array first (Option 1).");
                }   else {
                    searchAlgorithms.mainsearchforsearchB(input);
                }
                    break;

                case 4:
                    sortingAlgorithms.InsertionSort();
                    break;

                case 5:
                    sortingAlgorithms.quicksorting();
                    break;
                case 6:
                    System.out.println();
                    hashTable.main(args);
                    break;


                case 7:
                    System.out.println("Exiting...");
                    //running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1–7.");
                    break;
            }
        } 
            while (choice !=7);
            input.close(); // Close scanner

    }
    }

