package pushpak23L3OOP;
/*2. Java Program to Illustrates Use of Static Inner Class
Explanation:
made an Outer class and define a static Inner class in it. We define a non-static method as the show()
method in inner class and we try to call this method by inner class object and outer
 class object and we get the desired output.*/
class Outer {

    static class Inner {
        public void show() {
            System.out.println("This is the non-static method show() from the static Inner class.");
        }
    }
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {

        Outer.Inner innerObject = new Outer.Inner();
        innerObject.show();
    }
}





