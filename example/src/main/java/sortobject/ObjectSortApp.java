package sortobject;

public class ObjectSortApp {

    public static void main(String[] args) {

        ArrayInObj arr;
        int max = 100;
        arr = new ArrayInObj(100);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        System.out.println("Before sorting");
        arr.display();
        arr.insertSort();
        System.out.println("After sorting");
        arr.display();


    }


}
