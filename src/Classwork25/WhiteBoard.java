package Classwork25;

public class WhiteBoard extends AbstractBoard implements Moveable,Climbable{
    @Override
    public void move(){
        System.out.println("Move whiteBoard");
    }
    @Override
    public void climb(){
        System.out.println("Climb whit Board");
    }
}
