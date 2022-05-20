public class MyNode {
    private int value;
    private MyNode next;
    private int isHead;

    public MyNode(int num) {
        this.value = num;
        this.next = null;
        this.isHead = 0;

    }

    void setNext(MyNode n) {
        this.next = n;
    }

    int getValue() {
        return this.value;        
    }

    MyNode getNext() {
        return this.next;
    }

    


}
