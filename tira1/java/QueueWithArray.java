public class QueueWithArray implements QueueInterface {
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
        for (int i = tail; i < head; i++) {
            tmp[i] = queue[i];           
        }
        queue=tmp;
    }

    public void enqueue(int value) {
        if (head == queue.length-1 ) {
            upSize();
        }
        queue[head] = value;    
        head++;

    }

    public int dequeue() {
        int ret = queue[tail];
        tail++;
        return ret;
    }

    public Boolean isEmpty() {
        System.out.println("head ("+head +") minus tail ("+tail+") equals: " + (head-tail) );
        if (head-tail == 0) {
            return true;
        } else {
            return false;
        }
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
