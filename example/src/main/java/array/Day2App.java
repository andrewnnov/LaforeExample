package array;

public class Day2App {

    public static void main(String[] args) {
        Day2ArrayAndBubbleSort highArray;
        highArray = new Day2ArrayAndBubbleSort(100);
        highArray.insert(77);
        highArray.insert(99);
        highArray.insert(44);
        highArray.insert(55);
        highArray.insert(22);
        highArray.insert(88);
        highArray.insert(11);
        highArray.insert(00);
        highArray.insert(66);
        highArray.insert(33);

        highArray.display();

        int searchKey = 55;
        if (highArray.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }



//        highArray.delete(00);
//        highArray.delete(55);
//        highArray.delete(99);
        highArray.delete(88);
        highArray.display();



        highArray.sortBubble();

        highArray.display();
    }
}
