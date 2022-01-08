package Classwork24;

import java.awt.*;

public final class Rectangle extends Figure {
    private static int countOfRectangles;
    private static int countOfSquares;

    public static int getCountOfRectangles() {
        return countOfRectangles;
    }

    public static int getCountOfSquares() {
        return countOfSquares;
    }

    private int width;
    private int height;

    public Rectangle(int width, int height, LocationOfFigure location, Color color) {
        super(location, color);
        this.width = width;
        this.height = height;
        countOfRectangles++;
    }

    public Rectangle(int sideOfSquare,LocationOfFigure location, Color color) {
        super(location, color);
        this.width = sideOfSquare;
        this.height = sideOfSquare;
        countOfSquares++;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String speak() {
        if (this.width == this.height) {
            return String.format("Square(color - %s, visible - %s, %s, side length = %s)",
                    super.getColor(),
                    super.isVisible() ? "Yes" : "No",
                    super.getLocation(),
                    this.height);
        } else {
            return String.format(" Rectangle(color - %s, visible - %s, %s, height = %s, width = %s",
                    super.getColor(),
                    super.isVisible() ? "Yes" : "No",
                    super.getLocation(),
                    this.height,
                    this.width);
        }
    }
}
