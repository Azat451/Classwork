package Classwork25.newFile;

public class Main {
    public static void main(String[] args) {

        Writable writable1 = new WhiteBoard();
        Writable writable2 = new BlackBoard();

        writable2.write();
        writable1.write();

        handleWrite(new WhiteBoard());
        handleWrite(new BlackBoard());

    }

    public static void handleWrite(Writable writable) {
        writable.write();
    }
}
