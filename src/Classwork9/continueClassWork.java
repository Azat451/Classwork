package Classwork9;

import java.util.Random;

public class continueClassWork {
    public static void main(String[] args) {
        Random ran = new Random();
        //Task#3
        int[][] matrix = new int[5][5];
        int min = 10,max = 99;
        for(int i = 0;i < matrix.length;i++){
            for (int j= 0;j < matrix[i].length;j++){
                matrix[i][j] = ran.nextInt(max + 1 - min) + min;
                System.out.printf("%s ",matrix[i][j]);
            }
            System.out.println();
        }
        int minValue = matrix[0][0];
        int minValueI = 0;
        int minValueJ = 0;
        int maxValue = matrix[0][0];
        int maxValueI = 0;
        int maxValueJ = 0;
        for(int i = 0;i < matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = ran.nextInt(max + 1 - min) + min;
                if (matrix[i][j] < minValue){
                    minValue = matrix[i][j];
                    minValueI = i;
                    minValueJ = j;
                }
                if (matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                    maxValueI = i;
                    maxValueJ = j;
                }
            }
        }
        System.out.printf("minValue[%s][%s] = %s \n",minValueI,minValueJ,minValue);
        System.out.printf("maxValue[%s][%s] = %s\n",maxValueI,maxValueJ,maxValue);
    }
}
