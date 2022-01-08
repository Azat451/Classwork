package Classwork19;

public class Student {

    //otherClass
    String fullName;
    int age;
    int mark;

    public Student(String fullName, int age, int mark) {
        this.fullName = fullName;
        this.age = age;
        this.mark = mark;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark= mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", mark='" + mark + '\'' +
                '}';
    }
}
