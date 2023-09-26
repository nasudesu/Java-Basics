package Testikansio;

public class Person implements Comparable<Person>{
    int age;
    String name;
    Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age,person.age);
    }
}
