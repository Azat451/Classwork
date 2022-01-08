package Classwork24.Continue.NEwFile;

public abstract class AbstractFelins extends AbstractAnimal{
    private int nailsAmount;
    private double tailLength;
    private double mustacheLength;

    public AbstractFelins(String color, double weight, int age, int nailsAmount, double tailLength, double mustacheLength) {
        super(color, weight, age);
        this.nailsAmount = nailsAmount;
        this.tailLength = tailLength;
        this.mustacheLength = mustacheLength;
    }

    public void speak(){
        System.out.println("Meaw");
    }
    public void murr(){
        System.out.println("Murr");
    }
    public void sharpenClaws(){
        System.out.println("sharpen claws");
    }
    public void landOnLeaps(){
        System.out.println("landOnleaps");
    }
    public void meetOwner(){
        murr();
        sharpenClaws();
        landOnLeaps();
    }

    public int getNailsAmount() {
        return nailsAmount;
    }

    public void setNailsAmount(int nailsAmount) {
        this.nailsAmount = nailsAmount;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getMustacheLength() {
        return mustacheLength;
    }

    public void setMustacheLength(double mustacheLength) {
        this.mustacheLength = mustacheLength;
    }


}
