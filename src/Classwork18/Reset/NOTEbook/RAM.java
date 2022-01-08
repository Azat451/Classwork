package Classwork18.Reset.NOTEbook;

public class RAM {
    int size;
    String model;

    public RAM(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "size=" + size +
                ", model='" + model + '\'' +
                '}';
    }
}
