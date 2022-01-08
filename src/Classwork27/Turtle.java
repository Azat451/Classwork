package Classwork27;

public class Turtle implements Swimable,Comparable{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void swim(){
        System.out.println("Turtle swiming");
    }
    @Override
    public void makeNoiseSwim(){
        System.out.println("'Turtle noise swiming'\n");
    }

//    public void speak(){
//        swim();
//        makeNoiseSwim();
//    }
    public void layEggs(int eggsCount){
        System.out.println("Turtle lays eggs " + eggsCount);
    }

    @Override
    public int compareTo(Object o) {
        Turtle turtle = (Turtle) o;
        if (this.age > turtle.getAge()){
            return 1;
        }else if (this.age == turtle.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
}
