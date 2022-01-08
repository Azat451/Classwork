package QA;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader("input.txt");
//        Scanner sc =new Scanner(fileReader);
//        List<String> input = new ArrayList<>();
//        while (sc.hasNext()){
//            input.add(sc.nextLine());
//        }fileReader.close();
//        System.out.println(readFromFile("input.txt"));
//        System.out.println(readFromFile("patterns.txt"));

        List<String> input = readFromFile("input.txt");
        List<String> patterns = readFromFile("patterns.txt");
        List<String> result = new ArrayList<>();
        List<String> resilt2 = new ArrayList<>();
        for (String str : input){
            for (String patter : patterns){
                if (str.equals(patterns)){
                     result.add(str);
                }
            }
        }
        System.out.println(result);
        System.out.println(resilt2);
    }
    public static List<String> readFromFile(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        Scanner sc = new Scanner(fileReader);
        List<String> results = new ArrayList<>();
        while ((sc.hasNext())){
            results.add(sc.nextLine());
        }
        sc.close();
        fileReader.close();
        return results;
    }
}
