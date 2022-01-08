package Classwork12;

import java.util.Random;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Рекурсия - задание алгоритма вычисления функций с использованием вызова её самой
        int num = sc.nextInt();
        int Fib = fib(num);
        System.out.println(Fib);
    }
    static void recursionFunction(int num){
        System.out.println("Now: " + num);
        if (num == 0)return;
        System.out.println("Call: " + num);
        recursionFunction(num - 1);
    }
    static void recursionFun(int num){
        Random ran = new Random();
        double d = 111;
        double c = 111;
        System.out.println("Call: " + num);
        recursionFun(num + 1);
    }
    static int sum(int num){
        if (num == 0)return 0;
        return num + sum(num - 1);
    }
    static int sumTest(int num,int max){
        if (num == max) return max;
        System.out.println("Call: " + num);
        return num + sumTest(num + 1,max);
    }
    static int sumOFDigits(int num){
        if (num == 0)return 0;
        System.out.println("Call: " + num);
        return num%10 + sumOFDigits(num/10);
    }
    static int faCkTorial(int num){
        System.out.println("Call: " + num);
        if (num == 0)return 1;
        else {
            num = num * faCkTorial(num-1);
            return num;
        }
    }
    static int fib(int num){
        System.out.println("Call: " + num);
        if (num == 0)return 0;
        if (num == 1)return 1;
        return fib(num - 1) + fib(num-2);
    }
}
