package pushpak23L3OOP;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

/*Java Program to Implement Shape Interface using Circle and Rectangle Class
Explanation:
Interfaces are syntactically similar to classes, but they lack instance variables, and their methods are declared
without any body. Here we make the interface as Shape with two methods as input() and area() which are implemented by
further two classes as circle and rectangle who implements the interface Shape.*/
interface Shape{
    void input();
    void area();
}


class Circle implements Shape{
    private double redius;
    @Override
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Redius :");
        redius = sc.nextDouble();

    }
     @Override
    public void area(){
        double area = 3.14*redius*redius;
        System.out.println("Area of Circle is :"+area);
    }
}
class Reactangle implements Shape{
    private  double length;
    private double width;
    @Override
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length :");
        length = sc.nextDouble();
        System.out.println("Enter the Width :");
        width=sc.nextDouble();
    }
    @Override
    public void  area(){
        double a =  length*width;
        System.out.println("Area of Reactangle"+a);

    }
}

public class ShapeInterfaceDemo {
    public static void main(String[] args) {
        Circle c =new Circle();
        c.input();
        c.area();
        Reactangle r =new Reactangle();
        r.input();
        r.area();
    }
}
