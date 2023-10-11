package Chapter8.Exercises1.Task1;

import java.util.ArrayList;
import java.util.List;

public class Person{
    private int age;
    private String name;
    private String city;

    public Person(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(45, "Luke", "Miami"));
        personList.add(new Person(20, "John", "New York"));
        personList.add(new Person(50, "James", "California"));
        personList.add(new Person(25, "Mary", "New York"));
        personList.add(new Person(60, "Judas", "California"));
        personList.add(new Person(30, "Peter", "New York"));
        personList.add(new Person(35, "Paul", "Miami"));
        personList.add(new Person(55, "Simon", "California"));
        personList.add(new Person(40, "Mark", "Miami"));
        personList.forEach((person -> System.out.println(person.getAge())));
        System.out.println("--------------------------------------------------");
        personList.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        personList.forEach((person -> System.out.println(person.getAge())));
        System.out.println("--------------------------------------------------");
        personList.forEach((person -> {
            if (person.getCity().equalsIgnoreCase("New York")) {
                System.out.println(person.getName() + " " + person.getAge() + " " + person.getCity());
            }
        }));
    }

}
