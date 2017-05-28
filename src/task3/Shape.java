package task3;

import java.util.List;

public interface Shape {
    double getArea();

    static double getGenArea(List<Shape> shapeList){
        double genArea = 0.0;
        for (Shape shape : shapeList) {
            genArea += shape.getArea();
        }
        return genArea;
    }

}
