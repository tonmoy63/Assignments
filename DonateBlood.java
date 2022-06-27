package javaprogram;
import java.util.Scanner;  
public class DonateBlood {
public static void main (String[]args) {
	int age;
	int weight;
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter age: "); 
	age = sc.nextInt();
	System.out.println("Enter weight: "); 
	//reading a number from the user 
	weight = sc.nextInt();
	if(age>=25 & weight >=65) //condition check
	{
		System.out.println("you are eligible for donate blood");
		
	}else //execute when above conditions false
	{
		System.out.println("you are not eligible for donate blood");
	}
	
}


}
