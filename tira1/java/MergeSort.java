import java.util.Random;

public class MergeSort {
    private static int[] nums;

    public int[] getRandArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i =0; i< size; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }

    public MergeSort() {

    }
    public MergeSort(int[] input) {
        nums = input;

    }

    
    private void printArr(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print("]\n");
    }
    
    private  void mergeSort(int lo, int hi) {
        if (lo == hi) {
            return;
        }
        int mid = ((lo+hi) / 2); 
        mergeSort(lo, mid);
        mergeSort(mid+1, hi);
        merge(lo,mid,hi);
    }

    private  void merge(int lo, int mid, int hi) {
        int leftLen = mid - lo + 1;
        int rightLen = hi - mid;

        int[] leftArr = new int[leftLen];
        int[] rightArr = new int[rightLen];


        // unnecessary? somehow include it in the beef
        for (int i=0; i<leftLen;i++) {
            leftArr[i] = nums[lo+i];
        }
        for (int j=0; j< rightLen; j++) {
            rightArr[j] = nums[j+mid+1];
        }

        int i=0;
        int j=0;
        
        for (int k = lo; k <= hi; k++) {
            if (i == leftLen) {
                nums[k] = rightArr[j];
                j++;
                continue;
            }
            if (j == rightLen) {
                nums[k] = leftArr[i];
                i++;
                continue;
            }
            if (leftArr[i] <= rightArr[j] ) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }
        }

    }

    public static void main(String[] args) {

        MergeSort msort = new MergeSort();
        int[] arr = msort.getRandArray(500000);
        msort.nums = arr;

        long start = System.currentTimeMillis();
        msort.mergeSort(0, arr.length-1);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
    }
    
}
