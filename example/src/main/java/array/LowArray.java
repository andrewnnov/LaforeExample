package array;

public class LowArray {

    private long[] a;

    public LowArray(int size) {
        a = new long[size];
    }
    //set element
    public void setElement(int index, long value) {
        a[index] = value;
    }
    //get element
    public long getElement(int index) {
        return a[index];
    }
}
