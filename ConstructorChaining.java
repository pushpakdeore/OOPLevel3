package pushpak23L3OOP;

public class ConstructorChaining {
    ConstructorChaining(){
        this(20);
        System.out.println("Default constructor");
    }
    ConstructorChaining(int a){
        System.out.println("one parameter"+a);

    }
    ConstructorChaining(int a,int b){
        this();
        System.out.println("Constructor with two parameter");
        System.out.println("sum of parameter is :"+(a+b));

    }

    public static void main(String[] args) {
        ConstructorChaining a =new ConstructorChaining(2,5);

    }
}
