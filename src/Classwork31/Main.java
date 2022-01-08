package Classwork31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList
//        #1
//        ArrayList<Integer> square = new ArrayList<>();
//        for (int i = 1;i <= 10000; i++ ){
//            if (i * i <= 10000){
//                square.add(i * i);
//            }else {
//                break;
//            }
//        }
//        for (int i = 0;i < square.size();i++){
//            System.out.println(square.get(i));
//        }

//        #2
//        ArrayList<Integer> squares = new ArrayList<>(100);
//
//        int countNotOdd = 0;
//        for (int i = 1;i < 100;i++){
//            if(i % 2 == 0){
//                squares.add(countNotOdd,i);
//                countNotOdd++;
//            }else{
//                squares.add(i);
//            }
//        }
//        System.out.println(squares);
//        #3
//        ArrayList<Integer> squares = new ArrayList<>(100);
//        ArrayList<Integer> indexes = new ArrayList<>(100);
//        for (int i = 1;i <= 10000;i++){
//            if(i * i <= 10000){
//                squares.add(i * i);
//                if (squares.get(squares.size() - 1) % 2 == 0 || squares.get(squares.size() - 1) % 3 == 0);
//                indexes.add(squares.size() - 1);
//            }else {
//                break;
//            }
//        }
//
//        System.out.println(squares);
//        System.out.println(indexes);

        // #4

        //Test size
//        ArrayList<Integer> test = new ArrayList<Integer>();
//        test.add(10);
//        test.add(20);
//        test.size();
//        System.out.println(test.get(0) + "\n" + test.get(1) + "\n" + test.size());
        //Test add
//        ArrayList<Integer> test = new ArrayList<Integer>();
//        test.add(10);
//        test.add(0,20);
//        System.out.println(test.get(0) + "\n" + test.get(1));
        //Test set
//        ArrayList<Integer> test = new ArrayList<Integer>();
//        test.add(10);
//        test.set(0,20);
//        System.out.println(test.get(0));
//        System.out.println(test.size());
        //Test indexOf
//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(10);
//        test.add(20);
//        System.out.println(test.get(0) + "\n"
//                + test.get(1));
//        System.out.println(test.indexOf(20));
        //Test contains
//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(10);
//        test.add(13);
//        System.out.println(test.get(0) + "\n"
//                + test.get(1));
//        System.out.println(test.contains(20));
    }
}
