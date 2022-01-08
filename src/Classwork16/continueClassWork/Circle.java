package Classwork16.continueClassWork;

public class Circle {
    double radius;
    String color;
    boolean isItTreansparent;

    public Circle(double radius){
        this.radius = radius;
        this.color = "Black";
        this.isItTreansparent = false;
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
        this.isItTreansparent = false;
    }
    public Circle(double radius,String color,boolean isItTreansparent){
        this.radius = radius;
        this.color = color;
        this.isItTreansparent = isItTreansparent;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isItTreansparent() {
        return isItTreansparent;
    }
    public double getLenght(){
        return 2 * 3.14 * this.radius;
    }
    public double getSquare(){
        return 3.14 * this.radius * this.radius;
    }
    public void setItTreansparent(boolean itTreansparent) {
        isItTreansparent = itTreansparent;
    }
    @Override
    public String toString(){
        return String.format("Circle-%s\n----------------" +
                "\nRadius = %s" +
                "\nColor = %s" +
                "\nisTransparent = %s" +
                "\n",this.color,this.radius,this.color,this.isItTreansparent);
    }
}
