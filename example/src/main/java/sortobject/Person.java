package sortobject;

public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print(lastName + " " + firstName + " " + age);
        System.out.println("");

    }

    public String getLastName() {
        return lastName;
    }
}
