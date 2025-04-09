import java.util.ArrayList;
import java.util.List;

public class hashTable {
    public static void main(String[] args) {
        
    
    myHashSet hashSet = new myHashSet(15);
    //adds to the set
    hashSet.add("Luna");
    hashSet.add("Kai");
    hashSet.add("Mira");
    hashSet.add("Zane");
    hashSet.add("Nova");
    //hashSet.add("Orion");
    hashSet.add("Raya");
    //hashSet.add("Ezra");
    hashSet.add("Lyra");
    hashSet.add("Jax");
    hashSet.add("Alex");

    //prints the set
    hashSet.printSet();

    //checking, removing a value in the set
    System.out.println("\n'Zane' is in the Set: " + hashSet.contains("Zane"));
    System.out.println("Removing 'Zane'");
    hashSet.remove("Zane");
    System.out.println("\nChecking to see if 'Zane' is in the Set: " + hashSet.contains("Zane")); 
    System.out.println();
    hashSet.printSet();

    
    //looking for the location of a value 
    System.out.println();
    System.out.println("We can get the bucket Number where a name is stored:");
    System.out.println("'Kai' is located at bucket: " + hashSet.hashFunction("Kai"));
    System.out.println("'Alex' is located at bucket: " + hashSet.hashFunction("Alex"));
    
    }
    
}

 class myHashSet{
    private final int size;
    private final List<List<String>> buckets;

    public myHashSet(int size) {
        this.size= size;
        this.buckets= new ArrayList<>(size);
        for (int i=0; i < size;i++){
            buckets.add(new ArrayList<>());
        }

    }

    public int hashFunction(String value){
        return value.chars().reduce(0, Integer::sum) % size;
    }

    public void add(String value){
        int index= hashFunction(value);
        List<String> bucket = buckets.get(index);
        if (!bucket.contains(value)){
            bucket.add(value);
        }
    }

    public boolean contains(String value){
        int index= hashFunction(value);
        List<String> bucket = buckets.get(index);
        return bucket.remove(value);
    }

    public void remove(String value){
        int index= hashFunction(value);
        List<String> bucket = buckets.get(index);
        if (!bucket.contains(value)){
            bucket.remove(value);
        }
    }

    public void printSet(){
        System.out.println("Hash Set Contents");
        for(int index = 0; index < buckets.size(); index++){
            List<String> bucket = buckets.get(index);
            System.out.println("Bucket " + index + ": " + bucket);

        }
    }
}