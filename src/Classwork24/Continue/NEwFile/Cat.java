package Classwork24.Continue.NEwFile;

public class Cat extends AbstractFelins{

    public Cat(String color, double weight, int age, int nailsAmount, double tailLength, double mustacheLength) {
        super(color, weight, age, nailsAmount, tailLength, mustacheLength);
    }

    @Override
    public void eat() {
        System.out.println("I'm eat meat");
    }

    @Override
    public void sleep(){
        System.out.println("I'm sleeping day");
    }

    @Override
    public void speak(){
        System.out.println("Myaw");
    }

    @Override
    public String toString(){
        return String.format("Cat{%s, %s, %s, %s, %s, %s}",getAge(),getColor(),getWeight(),getNailsAmount(),getTailLength(),getMustacheLength());
    }
}
