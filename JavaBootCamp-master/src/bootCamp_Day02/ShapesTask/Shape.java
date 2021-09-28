package bootCamp_Day02.ShapesTask;

public  abstract class Shape {

    public String name;

    public Shape(String name){
        this.name = name;
    }

    public double area;
    public double perimeter;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();



    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}


class C{
  //  Shape s1 = new Shape();
}
