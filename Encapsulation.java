package Hd1;
//Tonmoy Halder
//Assignment
import java.util.Scanner;
 class Encapsulation {
	public static void main(String args[]) {
		Scanner cs = new Scanner(System.in);
		String student_name;
		 int student_pass;
		  int student_id;
		  int sub1,sub2,sub3,sub4,sub5;
		  System.out.println("Enter your Name:");
		  student_name= cs.nextLine();
		  System.out.println("Enter your password:");
		  student_pass= cs.nextInt();
		  System.out.println("Enter your id:");
		  student_id= cs.nextInt();
		  System.out.println("Enter marks of 5 subjects out of 100:");
		  System.out.println("Enter sub1:");
	      sub1=cs.nextInt();
	      System.out.println("Enter sub2:");
	      sub2=cs.nextInt();
	      System.out.println("Enter sub3:");
	      sub3=cs.nextInt();
	      System.out.println("Enter sub4:");
	      sub4=cs.nextInt();
	      System.out.println("Enter sub5:");
	      sub5=cs.nextInt();
	      encap obj= new encap();
	      obj.setStudent_name(student_name);
	      obj.setStudent_pass(student_pass);
	      obj.setStudent_id(student_id);
	      obj.calculate(sub1, sub2, sub3, sub4, sub5);
	      System.out.println("Name :"+obj.getStudent_name());
	      System.out.println("UserID :"+obj. getStudent_id());
	      System.out.println("Password :"+obj.getStudent_pass());
	      System.out.println("Total Marks:"+obj.total);
	      System.out.println("Percentage:"+obj.percentage+"%");
	      
}}
 class encap{
	private String Student_name;
	private int Student_pass;
	private  int Student_id;
	int total,percentage;
	public String getStudent_name() {
		return Student_name;
	}
	public  void setStudent_name(String Student_name) {
		this.Student_name=Student_name;
	}
	public int getStudent_pass() {
		return Student_pass;
	}
	public void setStudent_pass(int Student_pass) {
		this.Student_pass=Student_pass;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int Student_id) {
		this.Student_id=Student_id;
	}
	public double getPercentage() {
		
		return percentage;
	}
	public void calculate(int sub1, int sub2, int sub3,int sub4,int sub5) {
		total=(sub1+sub2+sub3+sub4+sub5);
		percentage=total*100/500;
	}

 }
