package Classwork28;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("file3.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while (sc.hasNextLine()){
            System.out.println(i + " - " + sc.nextLine());
            i++;
        }
    }
    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("qq.txt");
        FileWriter fileWriter = new FileWriter("qq1.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 0;
        boolean check = false;
        while (sc.hasNextLine()){
            String currentLine = sc.nextLine();
            if (!check && sc.nextLine().equals("0")){
                check = true;
            }
            if (check){
                i++;
                fileWriter.write(sc.nextLine());
                if (i != 3)
                    fileWriter.write("\n");
                else
                    i = 0;
            }
        }
        fileWriter.close();
        fileReader.close();
    }
}
