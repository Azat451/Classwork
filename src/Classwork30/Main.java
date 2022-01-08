package Classwork30;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//        fnfe();

        try {
            Object o = null;
            raiser(o);
        }
        catch (NullPointerException npe){
            System.out.println("Catch");
            npe.printStackTrace();
        }
    }

    static void raiser(Object o) throws NullPointerException{
        if (o == null)
            throw new NullPointerException();
    }

    public static void fnfe(){
        FileReader fileReader = null;
        try{
            System.out.println("Some extra logic");
            fileReader = new FileReader("Test123123.txt");
            System.out.println("Some extra logic");
            System.out.println("Some extra logic");
            fileReader.close();
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }finally {
            System.out.println(" finally");
        }
    }
}
