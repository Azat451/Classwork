package Classwork27;

public class Shark implements Swimable{

    @Override
    public void swim() {
        System.out.println("Shark swiming");
    }

    @Override
    public void makeNoiseSwim() {
        System.out.println("'Shark noise swiming'\n");
    }

    public void hunt(){
        System.out.println("Shark hunting");
    }

//    public void speak(){
//        swim();
//        makeNoiseSwim();
//    }
}
