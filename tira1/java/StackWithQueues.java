public class StackWithQueues implements StackInterface {
    QueueWithArray a, b;

    public StackWithQueues() {
        a = new QueueWithArray();
        b = new QueueWithArray();
    }

    public void push(int val) {
        while (b.isEmpty() == false) {
            a.enqueue(b.dequeue());
        }
        a.enqueue(val);
    }

    public int pop() {
        int tmp = (int) Integer.MAX_VALUE;

        while (a.isEmpty() == false) {
            tmp = a.dequeue();
            if (a.isEmpty() == true) {
                return tmp;
            } else {
                b.enqueue(tmp);
            }
        }
        return tmp;

    }

    public static void main(String[] args) {
        StackWithQueues s = new StackWithQueues();

        s.push(4);
        s.push(3);
        s.push(4);
        s.push(3);
        s.push(6);
        s.push(7);
        s.push(8);

        s.pop();
        System.out.println("should be seven: " + s.pop());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

    }

    @Override
    public Boolean isEmpty() {
        if (a.isEmpty() && b.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int peek() {
        int val = pop();
        push(val);
        return val;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }


}
