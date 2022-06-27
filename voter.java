package javaprogram;
import java.util.Scanner;
public class voter {
public static void main(String[]args) {
	
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age=");//reading a number from the user 
	age = sc.nextInt();
	
	if (age >=18) //checks the number is greater than 18 or not  
	{
		System.out.println("you are eligibale for vote");
		
	}
	else //executes when the above condition are false  
	{
		
		System.out.println("you are not eligible for vote");
	}
}
}