package Classwork33;

public class Main2 {
    public static void main(String[] args) {
//        WeekDays[] weekend = new WeekDays[]{WeekDays.MONDAY, WeekDays.TUESDAY,
//                WeekDays.WEDNESDAY, WeekDays.THURSDAY,
//                WeekDays.FRIDAY, WeekDays.SATURDAY, WeekDays.SUNDAY};

//        for (WeekDays weekDay : weekend){
//            System.out.println(weekDay);
//            System.out.println(weekDay.getCode());
//            System.out.println(weekDay.getRu());
//        }

//        defineDay(WeekDays.FRIDAY);
//        defineDay(WeekDays.SUNDAY);

        WeekDays[] weekDays = WeekDays.values();

        for (WeekDays weekDay : weekDays){
            System.out.println(weekDay);
            System.out.println(weekDay.ordinal()
            );
        }

    }
    public static void defineDay(WeekDays weekDay){
        switch (weekDay){
            case MONDAY:
                System.out.println("Work");
                break;
            case TUESDAY:
                System.out.println("Work");
                break;
            case WEDNESDAY:
                System.out.println("Work");
                break;
            case THURSDAY:
                System.out.println("Work");
                break;
            case FRIDAY:
                System.out.println("Work");
                break;
            case SATURDAY:
                System.out.println("Rest");
                break;
            case SUNDAY:
                System.out.println("Rest");
                break;
        }
    }
}
