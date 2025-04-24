import java.awt.*;

public abstract class Shapes {
    private double volume;

    public Shapes(double volume){
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
