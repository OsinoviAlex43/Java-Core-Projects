interface Shapes extends Comparable<Shapes> {
    double getVolume() ;
    @Override
    default int compareTo(Shapes shape) {
        return Double.compare(getVolume(), shape.getVolume());
    }
}
