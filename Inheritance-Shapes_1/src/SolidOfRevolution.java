public abstract class SolidOfRevolution extends Shapes {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public SolidOfRevolution(double volume,double radius){
        super(volume);
        this.radius = radius;
    }

}
