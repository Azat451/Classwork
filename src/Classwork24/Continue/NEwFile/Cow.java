package Classwork24.Continue.NEwFile;

public class Cow extends AbstractAnimal{

    public Cow(String color,double weight,int age){
        super(color,weight,age);
    }

    @Override
    public void eat() {
        System.out.println("I'm eat spring");
    }

    @Override
    public void sleep() {
        System.out.println("I'm sleeping night");
    }

    @Override
    public void speak(){
        System.out.println("Muu");
    }

    @Override
    public String toString(){
        return String.format("Cow{%s,%s,%s}",getColor(),getWeight(),getAge());
    }
}
