public abstract class SolidOfRevolution extends Shapes {

    protected double radius;


    public double getRadius() {
        return radius;
    }

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
