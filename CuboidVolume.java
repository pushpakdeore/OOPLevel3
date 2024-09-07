package pushpak23L3OOP;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class CuboidVolume {
    public static void calculateVolume(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Length :");
        double length =sc.nextDouble();

        System.out.print("Enter  breadth :");
        double breadth = sc.nextDouble();

        System.out.print("Enter height :");
        double heigth = sc.nextDouble();

        double volume = length*breadth*heigth;

        System.out.print("Volume of Cuboid is ="+volume);

    }

    public static void main(String[] args) {
        calculateVolume();
    }


}
