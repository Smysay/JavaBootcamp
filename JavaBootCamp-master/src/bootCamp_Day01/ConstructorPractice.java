package bootCamp_Day01;

class Rectangle{

    public double width, length;

    public Rectangle(double width, double length){
            this.width = width;
            this.length = length;
    }

    public double calculateArea(){
        return width * length;
    }

    public double calculatePerimeter(){
        return 2* width + 2*length;
    }

}


public class ConstructorPractice {
    int a = 100;

    public static void main(String[] args) {

        ConstructorPractice obj = new ConstructorPractice();
        System.out.println(obj.a);

        Rectangle rectangle1 = new Rectangle(5, 10);

        System.out.println( rectangle1.calculateArea() );
        System.out.println( rectangle1.calculatePerimeter() );

        Rectangle rectangle2 = new Rectangle(10, 20);

        System.out.println( rectangle2.calculateArea() );
        System.out.println( rectangle2.calculatePerimeter() );

    }

}
