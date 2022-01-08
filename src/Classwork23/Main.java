package Classwork23;

public class Main {
    public static void main(String[] args) {
        final int[] arrFinal = new int[10];
        for (int i = 1;i < arrFinal.length;i++){
            arrFinal[i] = i;
            System.out.printf("\n%s = %s",i,arrFinal[i]);
        }
        //arrFinal = new int[10];
    }
}
