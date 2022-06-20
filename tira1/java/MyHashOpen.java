import java.util.ArrayList;

public class MyHashOpen {
    int N;
    Integer[] cleared;
    Integer[] arr;


    public MyHashOpen() {
        N = 10;
        cleared = new Integer[100];
        arr = new Integer[100];
    }
    private int hashFunc(int value, int tries) {
        return (value % N) + tries;
    }

    private void h(int value, int tries) {
        System.out.println(tries);
        if (arr[hashFunc(value,tries)] == null && cleared[hashFunc(value,tries)] == null) {
            arr[hashFunc(value,tries)] = value;
            return;
        } else {
            h(value, tries + 1 );
        }
    }

    public void add(int value) {
        h(value, 0);
    }


    public void printHashTable() {
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println("Array index: " + i + "  equals "  + arr[i] + " ");
            } catch (Exception e) {
                // yeah ... just ignore nulls.
            }
        }
    }



    public static void main(String[] argv) {
        MyHashOpen h = new MyHashOpen();

        h.add(2);
        h.add(54);
        h.add(23);
        h.add(38);
        h.add(21);
        h.add(11);
        h.add(18);
        h.add(15);
        h.add(22);
        h.add(42);
        h.add(52);
        h.add(24);
        h.add(58);
        h.add(35);
        h.add(62);

        h.printHashTable();

    }
}
