public class Pyramid extends Shapes {
    private double s;
    private double h;

    public Pyramid(double h,double s){
        this.h = h;
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
        return h * s * 4 / 3;
    }
}
