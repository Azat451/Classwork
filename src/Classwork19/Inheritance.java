package Classwork19;

public class Inheritance {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Kevin Smith",45,99);
        students[1] = new Student("Kaede Smith",35,98);
        students[2] = new Student("Coyote Smith",36,100);
        students[3] = new Student("Con Smith",14,94);
        students[4] = new Student("Mask de Smith",25,98);

        Student[][] aarray = new Student[1][5];
        aarray[0] = students;
        int markSum = 0;

        for (Student student : students){
            markSum += student.getMark();
        }

        for (Student[] arrayStudents : aarray){
            for (Student student : arrayStudents){
                markSum = markSum + student.getMark();
            }
        }

//        System.out.println(markSum / students.length);
        markSum = 0;
        for (int i = 0;i < students.length;i++){
            markSum += students[i].getMark();
        }
//        System.out.println(markSum / students.length);


        Bread bread = new Bread(245.05,20,"HBK");
        bread.bake();
        bread.pack();

        Lepeshka lepeshka = new Lepeshka(145.45,15,"HBK",10);
        if (lepeshka.getWeight() == 0){
            System.out.println("Lepehska poddelka");
        }
        lepeshka.bake();
        lepeshka.pack();
        lepeshka.wrawPRints();
        lepeshka.varnish();
        System.out.println("\n" + bread.getPrice());
        System.out.println(lepeshka.getPrice());
    }
}

