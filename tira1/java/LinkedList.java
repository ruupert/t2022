public class LinkedList {
    private MyNode list;
    private MyNode last;
    private MyNode first;
    int count;

    public void LinkedList() {
        
    }
    
    void add(int num) {
        if (list == null) {
            this.list = new MyNode(num);
            this.last = list;
            this.first = list;
            this.count = 1;


        } else {
            MyNode newnode = new MyNode(num);
            this.last.setNext(newnode);
            newnode.setPrev(last);
            this.last = newnode;
            this.count++;

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
            tmp = tmp.getPrev();
        }
    }

    int popLast() {
        if (this.count <= 0) {
            return (int) Integer.MIN_VALUE;
        }
        int ret = last.getPrev().getValue();
        MyNode tmp = last.getPrev();
        tmp.nulNext();
        last = tmp;
        this.count--;
        return ret;
        
    }


    private void printList() {
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

        list.add(66);
        list.printList();

        list.del(36);
        list.printList();
        System.out.println("popped out:" + list.popLast());
        list.printList();
    }

}
