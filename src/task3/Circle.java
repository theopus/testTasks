package task3;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        if(radius <= 0)
            throw new IllegalArgumentException(radius + " <= 0");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": radius = " + radius;
    }

}
