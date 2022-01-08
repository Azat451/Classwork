package Classwork23;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas{
    public Test(){
    }

    @Override
    public void paint(Graphics graphics){
//        Circle[] circles = new Circle[]{new Circle(0,0,Color.YELLOW,50,50)};
//        for (Circle item : circles){
//        Circle circles1 = new Circle(0,0,Color.YELLOW,50,50);
//            graphics.setColor(circles1.getColor());
//            graphics.fillOval(circles1.getX(),circles1.getY(),circles1.getWidth(), circles1.getHeight());

        final double Pi = 3.1415;

//        graphics.setColor(Color.YELLOW);
//        graphics.fillOval(100,100,100,100);
//        System.out.println(String.format("Yellow, area %s, length %s",50 * 50 * Pi, 2 * Pi,(Pi * 50 + 100)));

//        graphics.setColor(Color.GRAY);
//        graphics.fillOval(250,100,100,100);
//        System.out.println(String.format("Gray, area %s, lenght %s",50 * 50 * Pi, 2 * Pi,(Pi * 50 + 100)));

//        final Circle[] circles = new Circle[7];
//        circles[0] = new Circle(100,100,Color.BLACK,60,60);
//        circles[1] = new Circle(150,100,Color.RED,60,60);
//        circles[2] = new Circle(170,100,Color.GRAY,60,60);
//        circles[3] = new Circle(90,90,Color.GREEN,60,60);
//        circles[4] = new Circle(80,90,Color.BLUE,60,60);
//        circles[5] = new Circle(70,65,Color.YELLOW,60,60);
//        circles[6] = new Circle(250,100,Color.DARK_GRAY,60,60);
//        for (Circle circle : circles){
//            graphics.setColor(circle.getColor());
//            graphics.fillOval(circle.getX(),circle.getY(),circle.getWidth(),circle.getHeight());
//        }
    }
    public static void main(String[] args){
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
