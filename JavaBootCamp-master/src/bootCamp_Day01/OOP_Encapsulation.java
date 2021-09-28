package bootCamp_Day01;

public class OOP_Encapsulation {

    private String name = "Cybertek";
    private double salary = 123;

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary =salary;
    }



}


class Test{

    public static void main(String[] args) {
        OOP_Encapsulation obj = new OOP_Encapsulation();

       // System.out.println(obj.name);
        System.out.println(obj.getName() );
        System.out.println(obj.getSalary());

        System.out.println("--------------------------------------------");

    }

}
