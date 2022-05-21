public class StackWithMyLinkedList extends MyLinkedList {
    
    void push(int num) {
        this.add(num);
    }

    int pop() {
        if (this.count <= 0) {
            return (int) Integer.MIN_VALUE;
        }
        int ret = this.last.getPrev().getValue();
        MyNode tmp = this.last.getPrev();
        tmp.nulNext();
        this.last = tmp;
        this.count--;

        return ret;
        
    }

    public static void main(String[] args) {
        StackWithMyLinkedList s = new StackWithMyLinkedList();
        s.push(5);
        s.push(54);
        s.printList();
        s.pop();
        s.printList();
        
    }
    
}
