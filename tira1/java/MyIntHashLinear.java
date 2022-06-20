import java.util.ArrayList;
import java.util.Arrays;

public class MyIntHashLinear {
    int N;

    // cheat a bit
    ArrayList<Integer>[] arr;

    public MyIntHashLinear() {
        N = 10;

        arr = new ArrayList[N];

        /*  // don't think this makes sense to create all the arrays beforehand. or does it :D... maybe it does.
            // depends on the clustering of the input values I guess.

         * for (int i = 0; i < arr.length; i++) {
         * arr[i] = new ArrayList<Integer>();
         * }
         */
    }

    private int hashFunc(int value) {
        return (value % N);
    }

    public void add(int value) {
        if (arr[hashFunc(value)] == null) {
            arr[hashFunc(value)] = new ArrayList<Integer>();
            arr[hashFunc(value)].add(value);
        } else {
            arr[hashFunc(value)].add(value);
        }
    }

    public boolean found(int value) {
        if (arr[hashFunc(value)] != null) {
            for (int i = 0; i < arr[hashFunc(value)].size(); i++) {
                if (arr[hashFunc(value)].get(i) == value) {
                    return true;
                } 
            }
        } 
        return false;

    }

    public int del(int value) {
        return 0;
    }

    public void printHashTable() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array index: " + i );
            if (arr[i] != null) {
                for (int j = 0; j < arr[i].size(); j++) {
                    System.out.print(" "+ arr[i].get(j));
                }
            } else {
                System.out.println("null");
            } 
            System.out.println("");
        }

    }

    public static void main(String[] argv) {
        MyIntHashLinear h =  new MyIntHashLinear();
        h.add(2);
        h.add(54);
        h.add(23);
        h.add(38);
        h.add(21);
        h.add(11);
        h.add(18);
        h.add(15);
        h.add(22);
        h.add(24);
        h.printHashTable();

        System.out.println("Found 33: " +  h.found(33) );
        System.out.println("Found 33: " +  h.found(15) );

    }
}
