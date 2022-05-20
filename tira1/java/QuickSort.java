public class QuickSort {
    private int[] nums;
    public QuickSort(int[] arr) {
        nums=arr;
    }

    private void printArr() {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print("\n");
    }

    private void sort(int a, int b) {
        if (a>= b) {
            return;
        }
        int k=split(a,b);
        sort(a,k-1);
        sort(k+1,b);
    }
    

    private int split(int a, int b) {
        int k = a;
        for (int i=a+1;i<=b; i++) {
            if (nums[i]<nums[a]) {
                k += 1;
                swap(i,k);
            }
        }
        swap(a, k);
        return k;
    }


    private void swap(int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {
        int[] input = {0,4,65,3,2,8,5};
        System.out.println(input);
        QuickSort q = new QuickSort(input);
        q.printArr();
        q.sort(0, q.nums.length -1);
        q.printArr();
    }
    
}
