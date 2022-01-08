package Classwork18.Reset.NOTEbook;

public class HDD {
    int size;
    int speed;

    public HDD(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }
}
