package Classwork24.Continue.NEwFile;

public class Main {
    public static void main(String[] args) {
        Cat matroskin = new Cat("Black",5.0,5,18,5.0,3);
        Tiger jinga = new Tiger("Orange",55,15,18,55.5,5);
        Cow burka = new Cow("White",5.0,3);

        System.out.println(matroskin);
        System.out.println(jinga);
        System.out.println(burka);

        matroskin.speak();
        jinga.speak();
        burka.speak();
    }
}
