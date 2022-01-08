package Classwork22;

public class Counter {
    private int id;
    private static int numOfCals;
    private static int objectsCount;

    public Counter(){
        objectsCount++;
    }

    public static int getObjectsCount(){
        return objectsCount;
    }

    public static void increment(){
        numOfCals++;
        System.out.println(numOfCals);
    }
    public static int factorial(){
        int factorial = 1;
        for (int i = 1;i <= numOfCals;i++){
            factorial = factorial * i;
        }
        System.out.println("factorial = " + factorial);
        return factorial;
    }
}
