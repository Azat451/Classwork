package Classwork18.Reset.NOTEbook;

public class SSD {
    String storage;

    public SSD(String storage) {
        this.storage = storage;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "storage=" + storage +
                '}';
    }
}
