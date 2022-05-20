public class Queue extends LinkedList {
    void enqueue(int num) {
        this.add(num);
    }


    int dequeue() {
        int ret = (int) Integer.MIN_VALUE;
        if (first != null) {
            ret = first.getValue();
            if (first.getNext() != null) {
                MyNode next = first.getNext();
                next.nulPrev();
                this.list = next;
                this.first = next;
                this.count--;    
            } else {
                this.last = null;
                this.first = null;
                this.list = null;
                this.count--;               
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        Queue n = new Queue();
        n.enqueue(5);
        n.enqueue(4);
        n.printList();
        n.dequeue();
        n.printList();


    }

}
