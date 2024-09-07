package pushpak23L3OOP;
/*Java Program to use of String Constructor

Explanation:
Constructor is used to initialize an object. Here you need to make two classes as Super and Sub class using
Inheritance. We initialize two different strings in the constructors of these two classes and with the help of the object
 of Subclass we print these strings.Java Program to Allocate and Initialize Super Class Members using Constructor*/
class SuperClass{
    String superString;

    public  SuperClass(String str){
        this.superString =str;
        System.out.println("Super class constructor called");
    }
}
class Subclass extends SuperClass{
    String subString;
    Subclass(String superStr,String subStr){
        super(superStr);
        this.subString=subStr;
        System.out.println("subclass Constructor called");

    }
    public void displyString(){
        System.out.println("superClass String"+subString);
        System.out.println("Subclass Strign"+superString);
    }
}
public class StringConstructor {
    public static void main(String[] args) {
        Subclass o= new Subclass("pushpak","kunal");
        o.displyString();
    }
}
