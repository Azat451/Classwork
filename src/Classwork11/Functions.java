package Classwork11;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Функция - это вспомогательный алгоритм,который возврашает значение-результат (число,симвлол или обьект другого типа)
        //*Функция обязана вернуть результат своего исполнение
        //!Функция, возращающая целое число,может использоваться везде,где и целая велечина!
        //================
        Scanner sc = new Scanner(System.in);

//        int sumMain = getCountedSum(2,3,4);
//        System.out.println("sumMain = " + getCountedSum(2,3,4));
        System.out.println("Check your number: ");
        int num = sc.nextInt();
        System.out.println("before");
        int result = doSomething(num);
        System.out.println("result = " + result);
        System.out.println("after");
    }
    static int getCountedSum(int a,int b,int c){
        int sum = a + b + c;
        return sum;
    }
    //-------------
    static int getCountedNum(int num){
        int sum = 0;
        while(num <= 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    //------------
    static int doSomething(int num){
        if(num < 10){
            return num;
        }
        System.out.println("doSomething after");
        return 0;
    }
}
