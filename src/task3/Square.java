package task3;

public class Square implements Shape {
    double sideLenght;

    public Square(double sideLenght) {
        if(sideLenght <= 0)
            throw new IllegalArgumentException(sideLenght + " <= 0");
        this.sideLenght = sideLenght;
    }

    @Override
    public double getArea() {
        return sideLenght * sideLenght;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": sideLenght = " + sideLenght;
    }
}
