package Classwork19;

public class Lepeshka extends Bread{
    double radius;

    public Lepeshka(double weight,double radius){
        if (weight > 200)
        setWeight(weight);
        else {
            System.out.println("Lepeshka fake");
            setWeight(0);
        }
        this.radius = radius;
    }


    public Lepeshka(double weight, double price, String producerCompany, double radius) {
        super(weight, price, producerCompany);
        this.radius = radius;
    }


    @Override
    void bake(){
        System.out.println("Bake Lepeshka");
    }
    @Override
    void pack(){
        System.out.println("Bake Lepeshka");
    }

    void wrawPRints(){
        System.out.println("Draw prints Lepeshka");
    }
    void varnish(){
        System.out.println("Varnish Lepeshka");
    }
}
