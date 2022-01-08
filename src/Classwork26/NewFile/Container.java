package Classwork26.NewFile;

import Classwork26.EegLayable;
import Classwork26.Swimable;

public class Container {
    private Swimable swimable;
    private EegLayable eegLayable;

    public Container(Swimable swimable, EegLayable eegLayable) {
        this.swimable = swimable;
        this.eegLayable = eegLayable;
    }

    public void transport(){
        System.out.println("Overload");
    }


    public Swimable getSwimable() {
        return swimable;
    }

    public void setSwimable(Swimable swimable) {
        this.swimable = swimable;
    }

    public EegLayable getEegLayable() {
        return eegLayable;
    }

    public void setEegLayable(EegLayable eegLayable) {
        this.eegLayable = eegLayable;
    }
}
