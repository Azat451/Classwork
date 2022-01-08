package Classwork24.Continue;

public class Pizza {
    private static int pizzaCounter;
    protected int pizzaNumber;
    private double price;
    private double weight;

    public Pizza(double price,double weight){
        this.price = price;
        this.weight = weight;
        pizzaCounter++;
        this.pizzaNumber = pizzaCounter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void cook(){
        System.out.println("Pizza cooking " + pizzaCounter);
    }
    public void deliver(){
        System.out.println(this);
    }
}
