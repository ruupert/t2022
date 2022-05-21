public class MyMergeSort {
    private int[] array;
    public MyMergeSort() {

    }

    public int[] sort(int[] arr) { 
        this.array = arr;
        this.msort(0,this.array.length - 1);    // array of [1,2] is of length 2 
                                                    // but indexes are 0-1
        return this.array;
    }

    private void msort(int lo, int hi) {
        if (lo == hi) {
            return;
        }
        int mid = ((lo+hi)/2);
        msort(lo,mid);
        msort(mid+1,hi);
        merge(lo, mid, hi);

    }
    private void merge(int lo, int mid, int hi) {
        int leftLen = mid - lo +1;  // for example mid is 50 and low is 25, then new array len is 26
        int rightLen = hi - mid;  // so 75 - 50 = 25 ok ... 

        int[] left = new int[leftLen];
        int[] right = new int[rightLen];

        // then populate the arrays
        for (int i = 0; i < leftLen; i++) {
            left[i] = this.array[lo+i];
        }
        for (int i = 0; i < rightLen; i++) {
            right[i] = this.array[i+mid+1];
        }

        int i=0;
        int j=0;

        for (int k = lo; k <= hi; k++) {
            if (i == leftLen) {
                array[k] = right[j];
                j++;
                continue;
            }
            if (j == rightLen) {
                array[k] = left[i];
                i++;
                continue;
            }
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }



    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", ");
        }
    }

    public static void main(String[] args) {
        MyMergeSort m = new MyMergeSort();
        int[] arr = {2,5,2,546,7,6};
        
        m.sort(arr);
    }
}
