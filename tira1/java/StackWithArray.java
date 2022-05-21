public class StackWithArray implements StackInterface {
    int[] stack;
    int pointer;


    public StackWithArray() {
        stack = new int[4];
        pointer = -1;
    }

    public Boolean isEmpty() {
        if (pointer == -1 ) {
            return true;
        } else {
            return false;
        }
    }

    private void upSize() {
        
        int[] newarr = new int[stack.length*2];
        for (int i=0; i< stack.length; i++) {
            newarr[i] = stack[i];
        }
        stack = newarr;
    }

    public void push(int val) {
        pointer++;
        try {
            stack[pointer] = val;
            
        } catch (Exception e) {
            upSize();
            stack[pointer] = val;
        }
    }
    
    public int pop() {
        if (pointer <= -1) {
            return (int) Integer.MIN_VALUE;
        } else {
        int ret = stack[pointer];
        
        pointer--;
        return ret;
        }
    }

    private void downSize() {
        // later
    }

    public static void main(String[] args) {
        StackWithArray s = new StackWithArray();
        s.push(4);
        s.push(3);
        s.push(4);
        s.push(3);
        s.push(6);
        s.push(7);
        s.push(8);

        for (int i = 0; i < s.stack.length; i++) {
            System.out.print(s.stack[i]+", ");
            
        }
        s.pop();
        System.out.println("should be seven: " + s.pop());
        s.pop();
        for (int i = 0; i <= s.pointer; i++) {
            System.out.print(s.stack[i]+", ");
            
        }
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        for (int i = 0; i <= s.pointer; i++) {
            System.out.print(s.stack[i]+", ");
            
        }

    }

    @Override
    public int peek() {
        return stack[pointer];
    }

    @Override
    public int size() {
        return pointer +1;
    }
}
