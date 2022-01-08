package Classwork29_Exeption.Continue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        throwNpe();
        throwErrorIfNotSquare(sc);
    }
    public static void throwNpe(){
        throw new ArrayIndexOutOfBoundsException("Test throwing");
    }

    //Code Nurdin
    public static void throwErrorIfNotSquare(Scanner square){
        System.out.print("Enter number: ");
        int num = new Scanner(System.in).nextInt();
        try{
            if (Math.pow(Math.sqrt(num), 2) != num)
                throw new Error("Non square");
            else
                System.out.println("This is square");
        } catch (Error e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    //Code Nursultan
    public static void throwErrorNotSquare2(int square){
        for(int i = 1;i < square / 2;i++){
            if (i * i == square){
                // soon continue code
            }
        }
    }

    //Code Sasha
//        try {
//        //enter crash/code
//        int[] num23 = {1, 2, 3};
//        System.out.println(num23(3));
//    } catch (Exteption e) {
//        System.out.println(e.getClass.getName() + ":_" + e.getmessage());
//    }
}