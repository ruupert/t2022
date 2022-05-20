public class LinkedList {
    protected MyNode list;
    protected MyNode last;
    protected  MyNode first;
    int count;

    public void LinkedList() {
        this.count = 0;
    }
    

    // push or enqueue or add to list.
    protected void add(int num) {
        if (list == null) {
            this.list = new MyNode(num);
            this.last = list;
            this.first = list;
            this.count++;
            System.out.println("count: " + this.count);


        } else {
            MyNode newnode = new MyNode(num);
            this.last.setNext(newnode);
            newnode.setPrev(last);
            this.last = newnode;
            this.count++;
            System.out.println("count: " + this.count);

        }
    }



    void del(int value) {
        MyNode tmp = last;
        while (tmp != null) {
            if (tmp.getValue() == value) {
                MyNode n = tmp.getNext();
                MyNode p = tmp.getPrev();

                if (n != null) {
                    tmp.getNext().setPrev(p);
                }

                if (p != null) {
                    tmp.getPrev().setNext(n);
                }
                break;
            }
            count--;
            tmp = tmp.getPrev();
        }
    }



    protected void printList() {
        if (list == null) {
            System.out.println("Empty list, count: " + this.count);
            return;
        }
        MyNode tmp = list;
        System.out.println("First value: " + first.getValue() +  " Last value: " + last.getValue());

        while (true) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getNext();
            if (tmp == null) {
                break;
            }

        } 
        System.out.print("\n");

    }



    public static void main(String[] s) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(46);
        list.add(36);
/*
        list.add(66);
        list.printList();

        list.del(36);
        list.printList();
        System.out.println("Popped out:" + list.pop());
        list.printList();
        list.add(66);
        list.add(34);
        list.add(22);
        list.add(11);
        list.printList();
        System.out.println("Dequeued: " + list.dequeue());
        list.printList();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.printList();
        list.push(5);
        list.push(355);
        list.pop();
        list.printList();
        list.add(3453);
        list.printList();
        System.out.println("Dequequed: " + list.dequeue());
        System.out.println("Dequequed: " + list.dequeue());
        System.out.println("Dequequed: " + list.dequeue());
        System.out.println("Popped: " + list.pop());
*/


    }

}
