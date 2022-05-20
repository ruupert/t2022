import java.util.Random;

public class TextBookMergeSort {
    private int[] nums;
    private int[] helper;

    public TextBookMergeSort() {
        
    }

    public int[] getRandArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i =0; i< size; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }
    private void printArr() {
        System.out.print("[");
        for (int i=0; i < nums.length;i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print("]\n");
    }

    private void printArr(int[] input) {
        System.out.print("[");
        for (int i=0; i < input.length;i++) {
            System.out.print(input[i]+", ");
        }
        System.out.print("]\n");
    }

    public void mergeSort(int[] input) {
        nums = input;
        helper = new int[input.length];
        sort(0,input.length-1);
    }

    private void sort(int a, int b) {
        if (a == b) {
            return;
        }   

        int k = (a+b)/2;
        sort(a,k);
        sort(k+1,b);
        merge(a,k,k+1,b);

    }
    private void merge(int a1, int b1, int a2, int b2) {
        int a = a1;
        int b = b2;

        for (int i = a; i<=b; i++) {
            if (a2 > b2 || (a1 <= b1 && nums[a1] <= nums[a2])) {
                helper[i] = nums[a1];
                a1++;
            } else {
                helper[i] = nums[a2];
                a2++;
            }
        }

        for (int i=0; i<= b; i++) {
            nums[i] = helper[i];
        }
        
    }

    public static void main(String[] args) {
        TextBookMergeSort msort = new TextBookMergeSort();
        int[] arr = msort.getRandArray(500000);

        long start = System.currentTimeMillis();
        msort.mergeSort(arr);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);

    }
    
}
