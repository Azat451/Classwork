package Classwork32;

public class Cat {
    private String name;
    private Integer age;

    public Cat(String name,Integer age){
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

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Cat){
            return ((Cat) obj).name.equals(this.name) && ((Cat)obj).age == this.age;
        }
        return false;
    }

}
