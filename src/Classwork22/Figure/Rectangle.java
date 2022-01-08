package Classwork22.Figure;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(LocationOfFigure location, String color, boolean isVisible, int height, int width) {
        super(location, color, isVisible);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String speak() {
        return toString();
    }

    @Override
    public String toString() {
        return String.format
                ("My location x = %s, y = %s, color - %s,i am %s visible, width = %s,height = %s",
                        location.getX(), location.getY(), color, isVisible ? "" : "Not",width,height);
    }
}


