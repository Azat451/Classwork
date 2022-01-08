package Classwork24;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test extends Canvas {
    static final Color DARK = Color.LIGHT_GRAY;
    static final Color LIGHT = Color.DARK_GRAY;
    static final Color CIRCLE_COLOR = Color.RED;
    static final int SIDE_OF_SQUARE = 50;

    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
        ChessBoard chessBoard = getFilledBoard();
        chessBoard = addCircles(chessBoard);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle square = chessBoard.getField(i, j);
                graphics.setColor(square.getColor());
                graphics.fillRect(SIDE_OF_SQUARE * i, SIDE_OF_SQUARE * j, square.getWidth(), square.getHeight());

                Circle circle = chessBoard.getCircle(i, j);
                if (circle != null) {
                    graphics.setColor(circle.getColor());
                    graphics.fillRect(circle.getRadius() * i, circle.getRadius() * j, circle.getRadius(),circle.getRadius());
                }
            }
        }
    }

    public ChessBoard getFilledBoard() {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                LocationOfFigure location = new LocationOfFigure(i, j);
                if ((i + j) % 2 == 0) {
                    chessBoard.fillField(new Rectangle(SIDE_OF_SQUARE, location, DARK));
                } else {
                    chessBoard.fillField(new Rectangle(SIDE_OF_SQUARE, location, LIGHT));
                }
            }
        }
        return chessBoard;
    }

    public ChessBoard addCircles(ChessBoard chessBoard){
        Random ran = new Random();

        for (int i = 0;i < 12;i++){
            LocationOfFigure location = new LocationOfFigure(ran.nextInt(7),ran.nextInt( 7 ));
            chessBoard.addCircles(new Circle(location, CIRCLE_COLOR, SIDE_OF_SQUARE));
        }
        return chessBoard;
    }

    public static void main(String[] args){
        Classwork23.Test canvas = new Classwork23.Test();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
