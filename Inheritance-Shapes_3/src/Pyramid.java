public class Pyramid implements Shapes {
    private double s;
    private double height;

    public Pyramid(double h, double s) {
        this.height = h;
        this.s = s;
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getVolume() {
        return  h * s * (1 / 3);
    }
}
