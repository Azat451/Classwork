package Classwork18;public class Cpu {
    private String model;
    private int cores;
    private double fequency;

    public Cpu(String model, int cores, double fequency) {
        this.model = model;
        this.cores = cores;
        this.fequency = fequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFequency() {
        return fequency;
    }

    public void setFequency(double fequency) {
        this.fequency = fequency;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "model='" + model + '\'' +
                ", cores=" + cores +
                ", fequency=" + fequency +
                '}';
    }
}
