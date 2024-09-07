package pushpak23L3OOP;
/*Java Program to Create a Method with 2 Parameters and without Return Type
Explanation:
Enter the length and breadth of the rectangle as input. Now we pass these values
as parameters to the new method where we calculate the area and print the output.*/
public class RectangleArea {
    public static void rectangleArea(double length,double breadth){
        double area =length*breadth;
        System.out.println("Area of rectangle :"+area);
    }

    public static void main(String[] args) {
        rectangleArea(3,4);
    }
}
