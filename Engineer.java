class Employee {
    protected String className;
    protected double salary = 10000;

    public void display(String className){
        System.out.println("Name of class: "+className);
    }

    public void calcSalary(double salary){
        System.out.println("Salary of employee: "+salary);
    }
}


public class Engineer extends Employee {

    // method overriding
    public void calcSalary(double salary){
        System.out.println("Salary of engineer: "+salary);
    }

    // method overloading
    public void calcSalary(){
        super.calcSalary(salary);
    }

    public static void main(String args[]){
        Engineer eng = new Engineer();;
        eng.display("Employee");

        // prints salary in the superclass
        eng.calcSalary();

        // prints salary in the subclass 
        eng.calcSalary(200000);
    }

}