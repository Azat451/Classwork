package Classwork32.Clswrk;

public class Meaw {
    private String name;
    private int age;

    public Meaw(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Meaw){
            return ((Meaw) obj).name.equals(this.name) && ((Meaw)obj).age == this.age;
        }
        return false;
    }
}
