package pushpak23L3OOP;
/*1. Java Program to create a calculator and apply all  features of Abstract class
Explanation:
Need  to create made add(),multiply(), divide(), Subtract()  as abstract methods in parent class which are defined in child
 class and we can call all these methods via making object of child class.as abstract methods
 in parent class which are defined in child class and we can call all these methods via making object of child class*/
abstract  class Calculator{
    public abstract void add(int a,int b);
    public  void sub(int a,int b){

    }
    public abstract void multiply(int a,int b);
    public abstract void divide(int a,int b);


}
class B extends Calculator{
    @Override
    public void add(int a,int b) {
        int c =a+b;
        System.out.println("add :"+c);
    }
    @Override
    public void sub(int a,int b) {
        int c=a-b;
        System.out.println("sub :"+c);
    }@Override
    public void multiply(int a,int b) {
        int c=a*b;
        System.out.println("multiply :"+c);
    }@Override
    public void divide(int a,int b) {
        int c=a/b;
        System.out.println("add :"+c);
    }
}


public class Main {
    public static void main(String[] args) {
        B a =new B();
        a.add(5,3);
        a.sub(72,3);
        a.multiply(2,45);
        a.divide(3,1);
    }
}
