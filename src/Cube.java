public class Cube implements Shape{
    private double width;
    private double volume;
    public Cube(double width){
        this.width=width;
        volume=width*width*width;
    }
    @Override
    public double getVolume() {
        return volume;
    }
}
