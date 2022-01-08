package Classwork30;

public class CatException {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat1");
        cats[1] = new Cat("Cat2");
        cats[2] = new Cat("Cat3");
        cats[3] = null;
        cats[4] = new Cat("Cat5");

        //Last Metod lesson
//        for (Cat cat : cats){
//            try {
//                System.out.println(cat.getName());
//            }catch (NullPointerException npe) {
//                System.out.println("NUllPointerException CATCH CAT");
//            }
//        }

        //New Metod lesson
        int count = 1;
        for (Cat cat : cats){
            try{
                System.out.println(cats[count].getName());
                count++;
            }catch (NullPointerException npe) {
                System.out.println("NUllPointerException CATCH CAT");

            }catch (Exception e) {
                System.out.println("Exception CATCH CAT");

//          }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("ArrayIndexOutOfBoundsException CATCH CAT");
                
            }finally {
                System.out.println("count = " + count);
            }
        }

    }
}
