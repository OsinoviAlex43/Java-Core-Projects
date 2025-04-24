import java.util.ArrayList;


public class Box extends Shapes {
    private ArrayList<Shapes> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean addShape(Shapes shape){
        if(available>=shape.getVolume()){
            shapes.add(shape);
            available-=shape.getVolume();
            return true;
        }
        return false;
    }
}

