package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task3Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            shapes.add(new Rectangle(random.nextInt(20) + 1 ,random.nextInt(10) + 1));
            shapes.add(new Circle(random.nextInt(20) + 1));
            shapes.add(new Square(random.nextInt(20) + 1));
        }

        System.out.println(shapes);
        System.out.println("General area = " + Shape.getGenArea(shapes));
    }
}
