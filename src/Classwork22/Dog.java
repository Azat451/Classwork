package Classwork22;

public class Dog {
    private String name;
    private double weight;
    private int age;

    private static int dogsCount;

    public Dog(String name,double weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        dogsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getDogsCount(){
        return dogsCount;
    }
}
