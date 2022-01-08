package Classwork61;

public class Greatest {
    public static <T extends Comparable<T>>T greatest(T x,T y,T z){
        T max = x; // Пока что максимальное
        if (y.compareTo(max) > 0){
            max = y; // Значит Y больше X
        }
        if (z.compareTo(max) > 0){
            max = x; // Значит Z больше всех
        }
        return max;
    }
    public static void main(String[] args){
        System.out.printf("Крупнейшее из %d,%d и &d это %d",3,4,5,greatest(3,4,5));

    }
}
