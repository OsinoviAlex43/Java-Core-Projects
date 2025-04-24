import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Box box = new Box(-333);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Box box = new Box(400);
        Shapes pyramid = new Pyramid(4,3);
        Shapes ball = new Ball(6);
        Shapes cylinder = new Cylinder(100,2);
        System.out.println(box.addShape(pyramid));
        System.out.println(box.addShape(ball));
        System.out.println(box.addShape(cylinder));

        List<Shapes> shapes = box.getShapes();
        Collections.sort(shapes);

        for (Shapes shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.getVolume());
        }
    }
}