public class Employee{
	protected String name;
	protected int age;
	protected int phno;
	protected double salary;
	protected String address;
	
	public void printInfo(){
		System.out.println("--------------Employee Details-------------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Ph no: "+phno);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);
	}
	
	public void printSalary(){	
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String args[]){
		System.out.println("-------XYZ Company Employee List--------");
		Officer off = new Officer("Arjun",19,1234567890,32597.54,"Kerala","Techie");
		
		Manager man = new Manager("Ajith",29,1154567890,5497.54,"Tamil Nadu","HR");
		
	}
	
}

class Officer extends Employee{
	private String spec;
	public void printSpec(){
			System.out.println("Specialization: "+spec);
	}
	Officer(String name,int age,int phno,double salary,String address,String spec){
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.salary = salary;
		this.address = address;
		this.spec = spec;
		printInfo();
		this.printSpec();
	}
	
}

class Manager extends Employee{
	private String dep;
	public void printDep(){
		System.out.println("Department: "+dep);
	}
	Manager(String name,int age,int phno,double salary,String address,String dep){
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.salary = salary;
		this.address = address;
		this.dep = dep;
		printInfo();
		this.printDep();
	}
	
	
}
