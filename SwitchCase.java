package javaprogram;
/*
 * @Author : Tonmoy Halder
 */
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		//taking input from user

		Scanner sc =new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		sc.close();	
		
		//switch case statement
		switch(name) {
		case "Tonmoy":System.out.println("switch case is easy for Tonmoy");
		break;
		case "owashim":System.out.println("switch case is easy for owashim");
		break;
		case "masud":System.out.println("switch case is easy for masud");
		break;
		case "puja":System.out.println("switch case is easy for puja");
		break;
		case "suvo":System.out.println("switch case is easy for suvo");
		break;
		
		
		default:System.out.println("name not match");
		}
		
		}

}
