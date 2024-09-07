package pushpak23L3OOP;
class  Employee{
     private String name;
     private  double salary;
      public Employee(String name ,Double salary){
          this.name =name;
          this.salary =salary;
      }
      public void Display(){
          System.out.println("Name :"+name);
          System.out.println("Salary : "+salary);
      }
      public static void swapEmplye(Employee emp1, Employee emp2){
           String tempname =emp1.name ;
           double tempsalary =emp1.salary;

           emp1.name =emp2.name;
           emp1.salary = emp2.salary;

           emp2.name =tempname;
           emp2.salary =tempsalary;


    }
}


public class EmployeeSwapDemo {
    public static void main(String[] args) {
        Employee e1 =new Employee("pushpak",343.7);
        Employee e2 =new Employee("Kunal",33.7);
        Employee.swapEmplye(e1,e2);
        e1.Display();
        e2.Display();

    }



}
