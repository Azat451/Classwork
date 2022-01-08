package Classwork26;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
//        turtle.EegLay();
//        turtle.swim();
//        turtle.wearsCarapace();

        System.out.println(Swimable.IS_SWIMABLE);
        System.out.println(Swimable.MAX_OCEAN_DEPTH);
        System.out.println(EegLayable.MAX_OCEAN_DEPTH);
        System.out.println(Carapaceble.MAX_OCEAN_DEPTH);
    }
}
