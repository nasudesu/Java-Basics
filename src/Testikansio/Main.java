package Testikansio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(12,"mike");
        Person person2= new Person(14,"john");
        Person person3 = new Person(15,"kevin");
        Person person4 = new Person(11,"max");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        for (Person person : personList){
            System.out.println(person.age);
        }

        System.out.println();
        Collections.sort(personList);

        for (Person person : personList){
            System.out.println(person.age);
        }

        String senttimetri = "350";
        double senttimetriD = Double.parseDouble(senttimetri);
        System.out.printf("Metreinä: %.2f",senttimetriD/100);

    }
}
