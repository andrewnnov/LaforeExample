package array;

public class LowArrayApp {

    public static void main(String[] args) {

        LowArray arr;
        arr = new LowArray(100);
        int nElems = 0; //
        int j;

        //add 10 elements
        arr.setElement(0, 77);
        arr.setElement(1, 99);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 0);
        arr.setElement(8, 66);
        arr.setElement(9, 33);

        nElems = 10;

        for(j = 0; j < nElems; j++) {
            System.out.print(arr.getElement(j) + " ");
        }
        System.out.println("");

        //search element
        int searchKey = 33;

        for (j = 0; j < nElems; j++) {
            if(arr.getElement(j) == searchKey) {
                break;
            }
        }

        if(j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        //delete element 55
        for (j = 0; j < nElems; j++) {
            if(arr.getElement(j) == 55) {
                break;
            }
        }

        for (int k = j; k < nElems - 1; k++) {
            arr.setElement(k, arr.getElement(k + 1));
        }
        nElems--;

        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElement(j) + " ");
        }
        System.out.println("");
    }


}
