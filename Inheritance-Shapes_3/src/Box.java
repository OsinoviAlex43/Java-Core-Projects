import java.util.ArrayList;
import java.util.List;


public class Box implements AddShape,GetShapes  {
    private ArrayList<Shapes> shapes = new ArrayList<>();
    private double available;
    protected double volume;

    public Box(double available) {
        if (available < 0) throw new IllegalArgumentException("Объем не может быть отрицательным");
        this.available = available;
        this.volume = available;
    }
    @Override
    public boolean addShape(Shapes shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        }
        return false;
    }
    @Override
    public List<Shapes> getShapes() {
        return shapes;
    }
}

