package javaprogram;
/*
 * @Author : Tonmoy Halder
 *java prigram to print the elements of array using for each loop
*/
public class Array {
	public static void main(String[] args) {
		//creating array
		int [] age= {3,5,9,50,45,66,44,76};  //array
		
		//for each loop
		 for (int element:age) {
			 System.out.println(" "+element);
		 }
	}
}
