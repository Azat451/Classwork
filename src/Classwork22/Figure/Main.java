package Classwork22.Figure;

public class Main {
    public static void main(String[] args) {
        LocationOfFigure location1 = new LocationOfFigure(1,1);
        Figure rectangle = new Figure(location1,"black",true);

        LocationOfFigure location2 = new LocationOfFigure(2,2);
        Figure triangle = new Figure(location2,"green",false);

        LocationOfFigure location3 = new LocationOfFigure(3,3);
        Rectangle wrongRectangle = new Rectangle(location3,"red",false,100,200);

        System.out.println(wrongRectangle.speak());
        System.out.println(rectangle.speak());
    }
}
