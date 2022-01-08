package Classwork25.newFile;

import Classwork25.AbstractBoard;

public class WhiteBoard extends AbstractBoard implements Writable{

    @Override
    public void write(){
        System.out.println("Write with markers");
    }
}
