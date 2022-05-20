class InsertionSort {

    public static void printArr(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print("]");
    }

    public static void myInsertionSort(int[] nums) {
        int tmp, j;
        for (int i=0; i < nums.length;i++) {
            j = i-1;

            while (j>=0 && nums[j+1] < nums[j]){
                tmp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = tmp;
                j--;
                
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("hello");
        int[] nums = {5, 2, 4, 2, 6, 1};
        printArr(nums);
        myInsertionSort(nums);
        printArr(nums);
    }
}