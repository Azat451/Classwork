package Classwork27;

public class Dolphin implements Swimable{

    @Override
    public void swim() {
        System.out.println("Dolphin swiming");
    }

    @Override
    public void makeNoiseSwim() {
        System.out.println("'Dolphin noise swiming'\n");
    }
}
