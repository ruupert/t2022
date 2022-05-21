public class QueueWithArray {
    int[] queue;
    int head;
    int tail;
    public QueueWithArray() {
        queue = new int[4];
        head = 0;
        tail = 0;

    }

    private void upSize() {
        int[] tmp = new int[queue.length*2];
        for (int i = tail; i <= head; i++) {
            tmp[i] = queue[i];           
        }
        queue=tmp;
    }

    private void enqueue(int val) {
        if (head == queue.length-1 ) {
            upSize();
        }
        queue[head] = val;    
        head++;

    }

    private int dequeue() {
        int ret = queue[tail];
        tail++;
        return ret;
    }


    public static void main(String[] args) {
        QueueWithArray q = new QueueWithArray();
        q.enqueue(14);
        q.enqueue(24);
        q.enqueue(34);                
        q.enqueue(44);
        q.enqueue(54);                
        q.enqueue(64);
        q.enqueue(74);                
        System.out.println("Should be fourteen: " + q.dequeue());
        System.out.println("Should be twenty four " + q.dequeue());

    }
    
}
