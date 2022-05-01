class Employee{
	protected String classname;
	protected int salary = 1000;
	void display(String classname){
		System.out.println("ClassName: "+classname);
	}
	void calcSalary(int salary){
		System.out.println("Salary: "+salary);
	}
}

class Engineer extends Employee{
	void calcSalary(int salary){
		System.out.println("Salary: "+salary);
	}
	void calcSalary(){
		super.calcSalary(salary);
	}
	public static void main(String args[]){
		Engineer eng = new Engineer();
		eng.display("Employee");
		eng.calcSalary(20000);
		eng.calcSalary();
		
	}
}
