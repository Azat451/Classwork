package Classwork29_Exeption;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//        try {
//            int d = 0;
//            int c = 10 / d;
//            System.out.println("Text");
//        } catch (Exception e){
//            System.out.println("catch " + e);
//            System.out.println("catch " + e.getClass());
//        }

        try {
            npe();
            throwNpe();
        } catch (NullPointerException e){
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }


//        iobeex();
//        fnfe();
    }

    public static void throwNpe(){
        throw new ArrayIndexOutOfBoundsException("Test throwing");
    }

    public static void npe() throws Exception{
        try{
            String str = null;
            str.length();
        }catch (NullPointerException e){
            System.out.println(e);
            throw new Exception(e.getMessage());
        }
    }

    public static void fnfe(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Test.txt");
        }catch (Exception exception){
            System.out.println("\n----------\n" + exception);
            System.out.println(exception.getMessage());
        }
    }

    public static void iobeex(){
        try{
           int [] arr = new int[2];
            System.out.println(arr[3]);
        } catch (Exception exception){
            System.out.println("\n----------\n" + exception);
        }
    }

    public static void iobeex2() throws Exception {
        try{
            int [] arr = new int[2];
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("\n----------\n" + exception);
            throw  new Exception(exception.getMessage());
        }
    }
}
