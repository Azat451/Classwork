package Classwork19;

public class Bread {
    double weight;
    double price;
    String producerCompany;

    public Bread(double weight, double price, String producerCompany) {
        this.weight = weight;
        this.price = price;
        this.producerCompany = producerCompany;
    }

    public Bread() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }

    void bake(){
        System.out.println("Bake bread");
    }
    void pack(){
        System.out.println("Pack bread");
    }
}
