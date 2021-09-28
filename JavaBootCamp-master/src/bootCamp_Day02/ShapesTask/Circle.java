package bootCamp_Day02.ShapesTask;

public final class Circle extends Shape {

    public double radius;
    public final static double PI ;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    static{
        PI = 3.14;
    }

    @Override
    public double calculateArea(){
        return radius * radius * PI;
    }

    @Override
    public double calculatePerimeter(){
        return radius * 2* PI;
    }

}
