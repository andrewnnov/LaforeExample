package array;

public class ClassDataApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        arr.insert("LastName1", "FirstName1", 24);
        arr.insert("LastName2", "FirstName2", 25);
        arr.insert("LastName3", "FirstName3", 26);
        arr.insert("LastName4", "FirstName4", 27);
        arr.insert("LastName5", "FirstName5", 28);
        arr.insert("LastName6", "FirstName6", 29);
        arr.insert("LastName7", "FirstName7", 42);
        arr.insert("LastName8", "FirstName8", 25);
        arr.insert("LastName9", "FirstName9", 46);
        arr.insert("LastName10", "FirstName10", 54);
        arr.insert("LastName11", "FirstName11", 64);
        arr.displayA();

        String searchKey = "LastName7";
        Person found;
        found = arr.find(searchKey);
        if(found != null) {
            System.out.println("Found");
            found.displayPerson();
        } else {
            System.out.println("Can't find");
        }

        arr.delete("LastName1");
        arr.delete("LastName2");
        arr.delete("LastName3");

        arr.displayA();
    }
}
