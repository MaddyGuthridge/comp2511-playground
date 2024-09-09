package people;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println(String.format(
            "Hi, my name is %s and I am %d years old",
            this.name,
            this.age
        ));
    }

    public static void main(String[] args) {
        Person keirvi = new Person("Keirvi", 18);

        keirvi.introduce();


        Person[] people = {
            new Person("Maddy", 22),
            new Person("Harry", 22),
        };
        for (Person p : people) {
            p.introduce();
        }
    }
}
