package Classwork24.Continue.NEwFile;

public class Tiger extends AbstractFelins{

    public Tiger(String color, double weight, int age, int nailsAmount, double tailLength, double mustacheLength) {
        super(color, weight, age, nailsAmount, tailLength, mustacheLength);
    }

    @Override
    public void eat(){
        System.out.println("I'm eat meat");
    }
    @Override
    public void sleep(){
        System.out.println("I'm sleeping night");
    }

    @Override
    public void speak(){
        System.out.println("RRAARR");
    }
    @Override
    public String toString(){
        return String.format("Tiger{%s, %s, %s, %s, %s, %s}",getAge(),getColor(),getWeight(),getNailsAmount(),getTailLength(),getMustacheLength());
    }
}
