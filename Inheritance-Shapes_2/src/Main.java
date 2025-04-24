public class Main {
    public static void main(String[] args) {
        Box box = new Box(400);
        Shapes pyramid = new Pyramid(4,3);
        Shapes ball = new Ball(6);
        Shapes cylindr = new Cylinder(100,2);
        System.out.println(box.addShape(pyramid));
        System.out.println(box.addShape(ball));
        System.out.println(box.addShape(cylindr));
    }
}