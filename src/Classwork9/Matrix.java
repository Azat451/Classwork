package Classwork9;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        //матрица - это прямоугольная таблица,/
        // составленная из элементов одного типа/
        // (чисел,строк и т.д)./
        // Каждый элемент матрицы имеет два индекса - номера строки и столбца.
        Random ran = new Random();
        //    int[] floor = {1,2,3};
//    int[] flats = {1,2,3,4};
//    for(int i = 0;i < floor.length;i++){
//        for (int j = 0;j < flats.length;j++){
//            System.out.printf("floor %s,flat %s \n",floor[i],flats[j]);
//            }
//        }
        // Wrong solution
        //-----------------
//        int[][] flats = {{1,2,3},
//                        {4,5,6},
//                        {7,8,9}};
//        for (int i = 0;i < 3;i++){
//           for (int j = 0;j < 3;j++){
//               System.out.printf("flats[%s][%s] = %s\n",i,j,flats[i][j]);
        //Другой вывод
        //System.out.printf("%d - этаж, %s - индекс квартиры. номер квартиры %d\n",i,j,flats[i][j]);
//           }
//        }
        //Wrong solution #2
        //-----------------
//       String[][] flatsNamed = {{"Asan","Esen","Uson"},
//                                {"Sosed","Sosed2","Sosed3"},
//                                {"INna","Anya","Vanya"}};
//        String[][] flatsNum = {{"1","2","3"},
//                                {"4","5","6"},
//                                {"7","8","9"}};
//       for (int i = 0;i < flatsNamed.length;i++){
//           for(int j = 0;j < flatsNamed[i].length;j++){
//               System.out.printf("Etaj %s, flatNum - %S, Hozain: %s\n",i,flatsNum[i][j],flatsNamed[i][j]);
//           }
//       }
        //sampleMatrix
//        int[][] array2d = new int[3][3];
//        for (int i = 0;i < array2d.length;i++){
//            for (int j = 0;j < array2d[i].length;j++){
//                array2d[i][j] = ran.nextInt(10);
//            }
//        }
//        for (int i = 0;i < array2d.length;i++){
//            for (int j = 0;j < array2d[i].length;j++){
//                System.out.print(array2d[i][j] + " ");
//            }
//            System.out.println();
//        }
        //-------------
        //Task#2
        int min = 1;
        int max = 9;
        int[][] matrix = new int[3][3];
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                matrix[i][j] = ran.nextInt(max - min + 1) + min;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                sum = sum + matrix[i][j];
                count++;
            }
        }
        System.out.printf("\nsum = %d",sum);
        System.out.printf("\ncount = %d",matrix.length * matrix[0].length);
        System.out.printf("\ncount = %d",count);
        System.out.printf("\navarage = %s",sum * 1.0/count);


    }
}
