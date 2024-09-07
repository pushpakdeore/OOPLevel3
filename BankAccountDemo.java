package pushpak23L3OOP;
/*Java Program to Create a class Bank Account and the Inner Class Interest in it
Explanation
We declare the Outer class as BankAcct and the inner class as Interest. Now we use
 the variables declared in the outer class to get the output in the inner class*/
class BankAcct{
    private double balance;
    private  double interestRate;
    public BankAcct(double balance,double interestRate){
        this.balance =balance;
        this.interestRate=interestRate;
    }
    public  void displayAccountDetail(){
        System.out.println("Account balnce :"+balance);
        System.out.println("Interst ="+interestRate);
    }
    class Interest{
        public void calculateInterest(){
            double interestAmount = (balance*interestRate)/100;
            System.out.println("Interest Amount "+interestAmount);
        }
    }

}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAcct b =new BankAcct(233,5.0);
        b.displayAccountDetail();
        BankAcct.Interest i =b.new Interest();
        i.calculateInterest();
    }

}
