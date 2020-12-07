package array;

public class Day2ArrayAndBubbleSort {

    private long[] arr;
    private int nElems;

    public int size() {
        return nElems;
    }

    public Day2ArrayAndBubbleSort(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean find(long searchElement) {
        int j;
        for(j =0; j < nElems; j++) {
            if(arr[j] == searchElement) {
                break;
            }
        }

        if(j == nElems) {
            return false;
        } else {
            return true;
        }
    }


    public long getElem(int index) {
        return arr[index];
    }


    public boolean delete(long deleteElement) {

        int j;
        for(j =0; j < nElems; j++) {
            if(arr[j] == deleteElement) {
                break;
            }
        }

        if(j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return true;
        }

    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }


    public void sortBubble() {
        int in;
        int out;

        for (out = nElems - 1; out >= 1; out--) {
            for (in = 0; in < nElems - 1; in++) {
                if(arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long tmp = arr[one];
        arr[one] = arr[two];
        arr[two] = tmp;
    }
}
