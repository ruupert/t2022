import javax.lang.model.type.NullType;

public class MyNode {
    private int value;
    private MyNode next;
    private MyNode prev;

    public MyNode(int num) {
        this.value = num;
        this.next = null;
        this.prev = null;     
    }

    void setNext(MyNode n) {
        this.next = n;
    }
    void nulNext() {
        this.next = null;
    }
    void nulPrev() {
        this.prev = null;
    }    
    void setPrev(MyNode n) {
        this.prev = n;
    }

    int getValue() {
        return this.value;        
    }

    MyNode getNext() {
        return this.next;
    }

    MyNode getPrev() {
        return this.prev;
    }


}
