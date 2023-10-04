public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Cube cube1 = Cube.builder().width(4).build();
        Pyramid pyramid1 = new Pyramid(45, 40);
        System.out.println(cube1.getVolume());

        System.out.println(pyramid1.getBaseWidth());
        System.out.println(pyramid1.getHeight());
        System.out.println(pyramid1.getVolume());
    }
}