public class Cylinder extends SolidOfRevolution {

    protected double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;

    }

    @Override
    public double getVolume() {
        return (Math.PI * radius * radius * height);
    }
}
