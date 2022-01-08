package Classwork22;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
//        Counter.increment();
//        Counter.factorial();

            Dog barbos = new Dog("Barbos",20,2);
            Dog rex = new Dog("Rex",15,3);
            Dog muhtar = new Dog("Muhtar",18,4);
            Dog sharik = new Dog("Sharik",18,4);
//        System.out.println("Dogs count = " + Dog.getDogsCount());

        Parent parent = new Parent();
        Parent.test();
        Child child = new Child();
        Child.test();
    }
}

