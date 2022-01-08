package Classwork28;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("Hello java.io");
        fileWriter.close();

        FileWriter fileWriter1 = new FileWriter("file2.txt");
        fileWriter1.write("Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll" +
                "\nMm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz" +
        "\n0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9");
        fileWriter1.close();
    }
}
