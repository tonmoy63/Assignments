package Hd1;
//assingment
public class employee {

	int employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	final double specialAllowance=250.80;
    final double hra=1000.50;
	//creating a constructor
	 employee(int Id,String Name,String Address,long Phone){ 
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
	}
	
	 //creating a method to calculate salary
	void calculateSalary () {
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
		System.out.println(salary);
	}
	//creating a method to calculate transport allowance
	void calculateTransportAllowance () {
		 double transportAllowance = 10*basicSalary/100;
		 System.out.println("Transport allowance of Trainee is: "+transportAllowance+"Rs");
	}
}
//creating a child class
class Manager extends employee{
//creating a constructor of manager class
	Manager(int id,String Name,String Address,long phone, double salary) {
		super(id,Name,Address,phone);
		this.basicSalary=salary;
	}
	//creating a method to calculate transport allowance of manager 
	void calculateTransportAllowance () {
		double transportAllowance = 15*basicSalary /100;
		 System.out.println("Transport allowance of Manager is: "+transportAllowance+"Rs");	
	}
	
}
//creating another child class of Employee
class Trainee extends employee{
	Trainee (int id, String Name, String Address, long Phone,double salary) {
		super(id,Name,Address,Phone);
		this.basicSalary=salary;
	}
}
//main class
 class Inheritanceactivity {

	public static void main(String[] args) {
		Manager mg =new Manager(126534,"peter","chennai india" , 273844, 65000);	//creating object of Manager class
		mg.calculateSalary();	//calling a method
		mg.calculateTransportAllowance();
		Trainee tr=new Trainee(29846,"jack","mumbai india", 442085, 45000);	//creating object of Trainee class
	    tr.calculateSalary();
	    tr.calculateTransportAllowance();
	}
}