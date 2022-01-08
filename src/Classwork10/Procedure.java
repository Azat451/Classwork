package Classwork10;

public class Procedure {
    public static void main(String[] args) {
        //>Процедура - вспомогательный алгоритм,
        // который выполняет некоторые действия
        //>В программе может быть много процедур
        //>Чтобы метод заработал,нужно вызвать его
        // по имени из программы или из другого метода

        //---------------
//        String error = "Error!";
//        String success = "Success!";
//        String warning = "warning";
//        printMessage(error);
//         printMessage(success);
//        printMessage(warning);
        //PrintMessage
        //-----------
        int[] arr = {11,22,44};
        printArray(arr);
    }

    static void printMessage(String message){
        System.out.println(message);
    }
    //New Program
    //---------
    static void printError(){
        System.err.println("Error!!!");
    }
    //---------
    static void printMessage2(String message){
        System.out.println(message);
    }
    //Message
    //---------
    static void printMulTable(){
        for (int i = 1;i <= 10;i++){
            for (int j = 1;j <= 10;j++){
                System.out.printf("\n %s * %s = %s",i,j,i * j);
            }
        }
    }
    static void printMulTableWithParam(int numMax){

        for (int i = 1;i <= numMax;i++){
            for (int j = 1;j <= numMax;j++){
                System.out.printf("\n %s * %s = %s",i,j,i * j);
            }
        }
    }
    //---------
    static void printArray(int[] array){
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
