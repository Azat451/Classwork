package Classwork25;

public class Main {
    public static void main(String[] args) {

        AbstractBoard blackBoard = new BlackBoard();
        AbstractBoard whiteBoard = new WhiteBoard();

        Moveable moveableWhiteBoard = new WhiteBoard();
        moveableWhiteBoard.move();
        Climbable climbableWhiteBoard = new WhiteBoard();
        climbableWhiteBoard.climb();
    }
}
