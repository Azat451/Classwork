package Classwork27;

public class Main {
    public static void main(String[] args) {
        Swimable swimableShark = new Shark();
        Swimable swimableTurtle = new Turtle();

        //Ввывод hunt из интерфейсной ссылки
//      ((Shark)swimableShark).hunt();

        //Checking the code
//        listeToCreature(swimableShark);
//        listeToCreature(swimableTurtle);

//        System.out.println(Shark.class);
//        System.out.println(swimableShark.getClass());
//        System.out.println(swimableTurtle instanceof Shark);
//        System.out.println(swimableShark instanceof Shark);

        Swimable[] swimables = new Swimable[9];
        Turtle[] turtles = new Turtle[3];
        Shark[] sharks = new Shark[3];
        Duck[] ducks = new Duck[3];
        swimables[0] = new Turtle();
        swimables[1] = new Turtle();
        swimables[2] = new Turtle();

        swimables[0] = new Shark();
        swimables[1] = new Shark();
        swimables[2] = new Shark();

        swimables[0] = new Duck();
        swimables[1] = new Duck();
        swimables[2] = new Duck();

        int countTurtles = 0;
        int countDucks = 0;
        int countSharks = 0;

        for (Swimable swimable : swimables) {
            if (swimable instanceof Shark) {
                sharks[countSharks] = (Shark) swimable;
                countSharks++;
            }
            if (swimable instanceof Turtle) {
                turtles[countTurtles] = (Turtle) swimable;
                countTurtles++;
            }
            if (swimable instanceof Duck) {
                ducks[countDucks] = (Duck) swimable;
                countDucks++;
            }
        }
//        System.out.println(turtles.length +"\n"+ sharks.length + "\n" + ducks.length);

        for (int i = 0; i < turtles.length; i++) {
            for (int j = i; j < turtles.length; j++) {
                if (turtles[i].compareTo(turtles[j]) < 0) {
                    Turtle turtle = turtles[i];
                    turtles[i] = turtles[j];
                    turtles[j] = turtle;
                }
            }
        }
    }
//    public static void listeToCreature(Swimable swimable){
//        ((Shark)swimable).getsAngry();
//    }

    public static Comparable[] sort(Comparable[] comparables, boolean isAsc) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i; j < comparables.length; j++) {
                if (isAsc) {
                    if (comparables[i].compareTo(comparables[j]) < 0) {
                        Comparable comparable = comparables[i];
                        comparables[i] = comparables[j];
                        comparables[j] = comparable;
                    }
                } else {
                    if (comparables[i].compareTo(comparables[j]) > 0) {
                        Comparable comparable = comparables[i];
                        comparables[i] = comparables[j];
                        comparables[j] = comparable;
                    }
                }
            }
        }
        return comparables;
    }
}
