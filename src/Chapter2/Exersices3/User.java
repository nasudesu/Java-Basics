package Chapter2.Exersices3;

import java.util.ArrayList;

public class User {
    String name;
    int age;
    ArrayList<Book> user_borrowed;
    User(String name,int age) {
        this.name = name;
        this.age = age;
        this.user_borrowed = new ArrayList<>();
    }
}
