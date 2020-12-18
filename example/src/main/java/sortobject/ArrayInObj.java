package sortobject;

public class ArrayInObj {

    private Person[] arr;
    private int nElems;

    public ArrayInObj(int max) {
        arr = new Person[max];
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        arr[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            arr[j].displayPerson();
        }
        System.out.println("");
    }

    public void insertSort() {
        int out;
        int in;

        for (out = 1; out < nElems; out++) {
            Person tmp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1].getLastName().compareTo(tmp.getLastName())>0) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = tmp;
        }
    }


}
