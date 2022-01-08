package Classwork27;

public class Duck implements Swimable{
    @Override
    public void swim() {
        System.out.println("Duck swiming");
    }

    @Override
    public void makeNoiseSwim() {
        System.out.println("'Duck noise swiming'\n");
    }

    public void layEggs(int eggsCount){
        System.out.println("Turtle lays eggs " + eggsCount);
    }

//    public void speak(){
//        swim();
//        makeNoiseSwim();
//    }
}
