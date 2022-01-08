package Classwork18;public class Hdd {
    private int size;
    private int speed;

    public Hdd(int size, int speed) {
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
        return "Hdd{" +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }
}
