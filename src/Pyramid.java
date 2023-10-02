public class Pyramid implements Shape{
    private double baseWidth;
    private double height;
    public Pyramid(double baseWidth, double height){
        this.baseWidth = baseWidth;
        this.height = height;
    }
    @Override
    public double getVolume() {
        return (baseWidth*baseWidth)/3*height;
    }
}
