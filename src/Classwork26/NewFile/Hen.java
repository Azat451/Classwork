package Classwork26.NewFile;

import Classwork26.EegLayable;
import Classwork26.Swimable;

public class Hen implements EegLayable,Swimable {

    @Override
    public void EegLay(){
        System.out.println("Chiken lays a egg");
    }
    @Override
    public void swim(){
        System.out.println("Chiken swim");
    }
}
