package Classwork32;

import java.util.LinkedList;

public class NewMain {
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        Cat cat1 = new Cat("Tom",3);
        Cat cat2 = new Cat("Kitty",2);
        Cat cat3 = new Cat("Nuk",1);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.get(2);
    }
}
