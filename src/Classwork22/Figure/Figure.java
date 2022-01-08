package Classwork22.Figure;

public class Figure {
    protected LocationOfFigure location;
    protected String color;
    protected boolean isVisible;

    public Figure(LocationOfFigure location,String color,boolean isVisible){
        this.location = location;
        this.color = color;
        this.isVisible = isVisible;
    }

    public LocationOfFigure getLocation() {
        return location;
    }

    public void setLocation(LocationOfFigure location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String speak(){
        return toString();
    }

    @Override
    public String toString(){
        return String.format
                ("My location x = %s, y = %s, color - %s,i am %s visible",
                        location.getX(),location.getY(),color,isVisible ? "" : "Not");
    }
}
