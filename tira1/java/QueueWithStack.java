public class QueueWithStack {
    int count;
    StackWithArray a;
    StackWithArray b;


    public QueueWithStack() {
        a = new StackWithArray();
        b = new StackWithArray();
        count = 0;


    }

    private void enqueue(int val) {
        while (b.isEmpty() == false) {
            a.push(b.pop());
        }
        a.push(val);
        count++;

    }

    private int dequeue() {
        while(a.isEmpty() == false ) {
            b.push(a.pop());
        }
        count--;
        return b.pop();
    }


    public static void main(String[] args) {

        QueueWithStack q = new QueueWithStack();
        q.enqueue(23);
        q.enqueue(13);
        q.enqueue(33);
        q.enqueue(53);
        q.enqueue(63);
        System.out.println("Count: "+ q.count + " should be 23: " + q.dequeue());
        q.dequeue();
        q.dequeue();
        q.enqueue(555);
        q.dequeue();
        q.dequeue();
        System.out.println("should be 555: " + q.dequeue());


        
    }

    
}
