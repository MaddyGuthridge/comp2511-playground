package people;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<String> friends;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    /** Instance method -- associated with a particular person */
    public void introduce() {
        System.out.printf(
            "Hi, my name is %s and I am %d years old. I have %d friends",
            this.name,
            this.age,
            this.friends.size()
        );
    }

    public String getName() {
        return this.name;
    }

    public void addFriend(String friendName) {
        this.friends.add(friendName);
    }

    /** Static method -- associated with the "concept of people" */
    public static int countPeople(Person[] people) {
        return people.length;
    }

    public static void main(String[] args) {
        Person maddy = new Person("Maddy", 22);

        maddy.introduce();

        Person[] people = {
                new Person("Maddy", 22), new Person("Harry", 22),
        };
        for (Person p : people) {
            p.introduce();
        }

        Person.countPeople(people);
    }
}
