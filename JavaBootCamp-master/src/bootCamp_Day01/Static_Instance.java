package bootCamp_Day01;

class Circle{

    public double radius; // all circle objects can have different radius
    public static double PI ; // all circle objects has same PI

    // static      sheet
    // static     properties

    static{
        PI = 3.14;
        /*
        we can use this block to set static variables even if the variables takes more than 1 step to set them
         */
    }


    public double calculateArea(){
        return PI * radius * radius;
    }

}

public class Static_Instance {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
                circle1.radius = 5;

     //   System.out.println( circle1.PI );
        System.out.println( Circle.PI );

     //   System.out.println( circle1.calculateArea() );

    }

}


class ClassA{

    static int a = 100;
    int b = 200;

    static class ClassB{

        public static void method1(){
            System.out.println(a);
          //  System.out.println(b);
        }

    }

}


class ClassC extends ClassA.ClassB{

}


class ClassD{

}