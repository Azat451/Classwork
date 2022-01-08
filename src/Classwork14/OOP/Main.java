package Classwork14.OOP;

public class Main {
    public static void main(String[] args) {
        Animal wolf = new Animal();
        wolf.name = "White wolf";
        wolf.isPredator = true;
        if (wolf.isPredator){
            System.out.println(wolf.name + " Very dangerous");
        }else {
            System.out.println(wolf.name + " Very kind");
        }
    }
}
