package Classwork32.Clswrk;

import Classwork32.Cat;

public class Mouse {
    private String name;
    private int age;

    public Mouse(String name,int age){
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
        if (obj instanceof Mouse){
            return ((Mouse) obj).name.equals(this.name) && ((Mouse)obj).age == this.age;
        }
        return false;
    }
}
