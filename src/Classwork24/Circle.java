package Classwork24;

import java.awt.*;

public final class Circle extends Figure {
    private int radius;

    public Circle(LocationOfFigure location, Color color, int radius) {
        super(location, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String speak(){
        return String.format("Circle(color - %s,visible - %s,%s, length radius - %s)",
        super.getColor(),
        super.isVisible() ? "Yes": "No",
        super.getLocation(),
        this.radius);
    }
}
