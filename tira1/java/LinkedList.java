public class LinkedList {
    private MyNode list;


    public void LinkedList() {
        
    }
    
    private void add(int num) {
        if (list == null) {
            list = new MyNode(num);

        } else {
            MyNode newnode = new MyNode(num);
            MyNode tmp = list;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newnode);
            

        }
    }

    private void del(int value) {
        MyNode tmp = list;
        MyNode prev = tmp;
        while (tmp != null) {
            if (tmp.getValue() == value) {
                

            }
        }
    }


    private void printList() {
        MyNode tmp = list;
        while (true) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getNext();
            if (tmp == null) {
                break;
            }

        } 

    }



    public static void main(String[] s) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(46);
        list.add(36);
        list.add(66);
        list.add(36);
        list.printList();
    }

}
