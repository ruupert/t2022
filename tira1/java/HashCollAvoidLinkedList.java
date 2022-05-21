public class HashCollAvoidLinkedList {
    int N;
    MyLinkedList[] arr;
    int HASHMAPSIZE = 100;
    
    public HashCollAvoidLinkedList() {
        this.N = 10;
        this.arr = new MyLinkedList[HASHMAPSIZE];
    }
    public HashCollAvoidLinkedList(int n) {
        this.N = n;
        this.arr = new MyLinkedList[HASHMAPSIZE];
    }
    private void initializeHmap() {
        for (int i = 0; i < HASHMAPSIZE; i++) {
            this.arr[i] = new MyLinkedList();
            
        }        
    }
    public Boolean get(int value) {
        int hashval = value % this.N ;
        Boolean ret = false;
        try {
            if (arr[hashval].find(value)) {
                ret = true;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return ret;
    }

    public int getHash(int value) {
        return value % this.N ;
        
    }

    public void add(int value) {
        int hashval = value & this.N;
        System.out.print(hashval+ " ");
        if (this.arr[hashval] == null) {
            this.arr[hashval] = new MyLinkedList();
            this.arr[hashval].add(value);
        } else {
            this.arr[hashval].add(value);
        }       
    }

    public void printHashCounts() {
        System.out.println(this.arr.length);
        for (int i = 0; i < this.arr.length; i++) {
            try {
                System.out.print("Hash: " + i + " count: " + this.arr[i].count + "\n");
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    public static void main(String[] args) {
        HashCollAvoidLinkedList h = new HashCollAvoidLinkedList();
        for (int i = 0; i < 1500; i++) {
            h.add(i);
            
        }
        h.printHashCounts();

    }
}