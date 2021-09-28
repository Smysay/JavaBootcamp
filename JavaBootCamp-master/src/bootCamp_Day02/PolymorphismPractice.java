package bootCamp_Day02;

import bootCamp_Day02.ShapesTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismPractice {

    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.addAll(Arrays.asList(
               new Circle(5),
                new Rectangle(10, 5),
                new Square(5),
               new Cube(7)
        ));


     //   Circle circle = new Shape();
        int a = 10;
        double b = a;  // implicit casting

        long l = 100;
        short s = (short)l;  // explicit casting. mannually done



        Shape shape =  new Circle(5) ;  //upcasting: converting smaller type to larger. implicitly done

        Square square = new Square(4);

        Shape shape2 = square; //upcasting: converting smaller reference type to larger. implicitly done



        Shape shape3 = new Cube(4);
        // shape3.calculateVolume();

        Cube cube = (Cube) shape3; // down casting: converting larger reference type to smaller
        cube.calculateVolume();


        /*
        WebDriver driver = new ChromeDriver();

        TakeScreenShot ts = (TakeScreenShot)driver;
        JavaScriptExecuter js = (JavaScriptExecuter)driver;
         */


        Shape shape4 = new Circle(10);

    //    Square s1 = (Square) shape4;  // there MUST be IS A relation between objects in order to casting

        /*
        WebDriver driver = new ChromeDriver();

        FireFoxDriver firefox = (FireFoxDriver)driver;  // No IS A relation ==> ClassCastException


         */


    }
}
