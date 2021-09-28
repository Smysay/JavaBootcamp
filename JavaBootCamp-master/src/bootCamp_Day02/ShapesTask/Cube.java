package bootCamp_Day02.ShapesTask;

public final class Cube extends Shape implements HasVolume{

    public double side;
    public double volume;

    public Cube(double side){
        super("Cube");
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume =calculateVolume();
    }


    @Override
    public double calculateArea() {
        return side * side * 6;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4 * 6  ;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
