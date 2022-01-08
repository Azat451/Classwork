package Classwork16.continueClassWork;

import Classwork16.Class.Rectangle;

import java.util.Random;
import java.util.Scanner;

public class Constructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter height = ");
//        int h = sc.nextInt();
//        System.out.print("Enter widht = ");
//        int w = sc.nextInt();
//        Rectangle rectangle = new Rectangle(h,w);
//        System.out.println(rectangle);

//        Cat cat = new Cat("Angel", 6);
//        System.out.println(cat);

        Circle black = new Circle(100);
        Circle yellow = new Circle(100,"Yellow");
        Circle hamleon = new Circle(100,"Green",true);

//        System.out.println(black);
//        System.out.println(yellow);
        System.out.println(hamleon);

        int N = 5;
        hamleon.setRadius(hamleon.getRadius() * N);
        System.out.println(hamleon);
        System.out.println("Lenght = " + hamleon.getLenght());
        System.out.println("Square = " + hamleon.getSquare());

        Random ran = new Random(100);
        Circle[] arrCircle = new Circle[100];
        int count = 0;
        int radius = 0;
        for (int i = 0;i < 100;i++){
            radius = ran.nextInt();
            if (radius % 3 == 0){
                arrCircle[count++] = new Circle(radius);
            }
        }

        for (int i = 0;i <= count;i++){
            if (i % 3 == 0){
                System.out.println(arrCircle[i]);
            }
        }
    }
}
