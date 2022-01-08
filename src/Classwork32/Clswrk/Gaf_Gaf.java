package Classwork32.Clswrk;

public class Gaf_Gaf {
    private String name;
    private int age;

    public Gaf_Gaf(String name,int age){
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
        if (obj instanceof Gaf_Gaf){
            return ((Gaf_Gaf) obj).name.equals(this.name) && ((Gaf_Gaf)obj).age == this.age;
        }
        return false;
    }
}
