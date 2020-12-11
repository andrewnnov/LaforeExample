package array;

public class InsertSort {

    private long[] a;
    private  int nElems;
    public InsertSort(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {

        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void insertSort() {
        int in, out;

        for (out = 1; out < nElems; out++) {  //out - select marker
            long temp = a[out]; // copy select element
            in = out; // start move with out
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }



}
