package Classwork23;

import Classwork24.Figure;
import Classwork24.LocationOfFigure;

import java.awt.*;

public class Circle extends Figure {
    private int width;
    private int height;

    public Circle(LocationOfFigure location, Color color, int width, int height) {
        super(location, color);
        this.width = width;
        this.height = height;
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
}
