package task3;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if(width <= 0 || height <= 0)
            throw new IllegalArgumentException(width + " and/or " + height + " <= 0");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": width = " + width + ", height = " + height;
    }
}
