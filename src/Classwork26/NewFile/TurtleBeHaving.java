package Classwork26.NewFile;

import Classwork26.Carapaceble;
import Classwork26.EegLayable;
import Classwork26.Swimable;

public interface TurtleBeHaving extends Carapaceble, EegLayable, Swimable {

    @Override
    default void swim() {
        System.out.println("Turtle can swim");
    }

    @Override
    default void EegLay(){
        System.out.println("Turtle lay egg");
    }

    @Override
    default void wearsCarapace() {
        System.out.println("Turtle wear carapace");
    }
}
