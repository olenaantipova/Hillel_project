package ua.hillel;

import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void checkConstructor() {
        Person person1 = new Person("Mattew Bellami", 42);
        System.out.println(person1.name + " is " + person1.age);
        Person person2 = new Person( "Anna Cobein",38);
        System.out.println(person2.name + " is " + person2.age);
    }
}


