public class Shape {
    public String toString() {
        return "This is a shape";
    }

    int calculateArea() {
        return 0;
    }
}


class Circle extends Shape {
    private int radius;

    public Circle(int newRadius) {
        radius = newRadius;
    }

    public String toString() {
        return "This is a Circle - its radius is " + radius;
    }

    int calculateArea() {
        return (int)(Math.PI * Math.pow(radius, 2));
    }
}


class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int newHeight, int newWidth) {
        width = newWidth;
        height = newHeight;
    }

    public String toString() {
        return "This is a Rectangle - its size is " + height + " x " + width;
    }

    int calculateArea() {
        return width * height;
    }

}