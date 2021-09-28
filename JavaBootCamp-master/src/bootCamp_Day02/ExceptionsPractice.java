package bootCamp_Day02;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionsPractice {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
     //   System.out.println( arr[258] );// unchecked

    //   new FileInputStream(""); // checked

    //    System.out.println( 9 / 0  );  // unchecked exception

    //    Thread.sleep(1000);  // checked

        /*
         Browser = cybertek

         Driver:
            throw new RuntimeException("Invalid Browser Name")
         */

    //    throw new RuntimeException("Invalid browser name");

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            // System.exit(0); // stops the execution of finally block
        }finally {
            System.out.println("Finally Block");
        }

        System.out.println("Handled");

    }


    public void test1() throws IOException{

        throw new IOException();

    }


    public void test2(){
        try {
            test1();
        }catch (IOException e){

        }

    }

    public void test3(){
        test2();
    }





}
