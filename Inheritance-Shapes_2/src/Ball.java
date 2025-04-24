public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (Math.PI * radius * radius * radius * 4 / 3);
    }
}
