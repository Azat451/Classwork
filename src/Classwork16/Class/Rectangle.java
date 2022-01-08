package Classwork16.Class;

public class Rectangle {
    int width;
    int height;
    int area;
    String color;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        if (width <= 0){
            System.err.println("Error");
        }else {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height <= 0){
            System.err.println("Error");
        }else {
            this.height = height;
        }
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        area = width * height;
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
       return String.format("Rectangle\nHeight = %s \nWidht = %s\nArea = %s",getHeight(),getWidth(),getArea());
    }
}
