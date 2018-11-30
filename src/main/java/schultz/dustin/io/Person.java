package schultz.dustin.io;

import java.util.*;

public class Person {

    int ID;
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int ID, int age, String name) {
        this.age = age;
        this.name = name;
        this.ID = ID;
    }

    public void increaseAge(){
        age++;
    }

    public static void main(String[] args) {
        Map<Integer, Person> list = new HashMap<>();
        Person jamie = new Person(1,22,"Jamie ");
        Person peterson = new Person(2,55,"Peterson ");
        jamie.increaseAge();
        list.put(jamie.ID,jamie);
        list.put(peterson.ID,peterson);
        System.out.println(list);
        for(Person p : list.values()){
            System.out.println(p);
        }
    }
}
