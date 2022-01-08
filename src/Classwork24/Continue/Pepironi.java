package Classwork24.Continue;

import javax.xml.transform.sax.SAXResult;

public class Pepironi extends Pizza{
    private static int pepironiCounter;
    private boolean isSpicy;
    private int pizzaNumber;

    public Pepironi(double price,double weight,boolean isSpicy){
        super(price,weight);
        this.isSpicy = isSpicy;
        pepironiCounter++;
        this.pizzaNumber = pepironiCounter;
    }

    public boolean isSpicy(){return isSpicy;}

    public void setSpicy(boolean spicy){isSpicy = spicy;}

    @Override
    public void cook(){
        System.out.printf("Cooking Pizza #%s, Pepironi #%s \n",super.pizzaNumber,this.pizzaNumber);
    }
    @Override
    public String toString(){
        return String.format("(Pepironi, %s, %s, %s)", getWeight(),getPrice(),isSpicy ? "spicy" : "not spicy");
    }
}
