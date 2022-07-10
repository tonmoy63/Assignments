package javaprogram;

 // @Author : Tonmoy Halder
//nobody can creat object of this class
public class Hard {
       String name;
       int id;
       private Hard(String name ,int id) {
    	   this.name = name;
    	   this.id = id;
       }
       void display() {
    	   System.out.println("Private Constructor");	   
    	   }
         class Very{
        	 public static void main(String args []) {
        		// Hard obj =new Hard(name:"Tonmoy",id:17000);
        	 }
       }
}
