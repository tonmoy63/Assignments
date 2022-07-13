package Hd1;

 public interface LibraryUser {
     void registerAccount();
	 void requestBook();
}
 class KidUsers implements LibraryUser {
	int age;
	String bookType;
	

public void registerAccount() {
	if (age <12) 
		System.out.println("You have successfully registered under a Kids Account");
	
	if (age > 12) 
		System.out.println("Sorry,Age must be less than 12 to register as a kid");
}

public void requestBook() {
	if(bookType.equals("Kids")) 
		System.out.println("Book Issued successfully, please return the book within 10 day");
	 else 
		System.out.println("Oops, you are allowed to take only kids books");
}
 }

 class AdultUser implements LibraryUser {
		int age;
		String bookType;

	public void registerAccount() {
		if (age > 12) 
			System.out.println("You have successfully registered under a Adult Account");
		
		if (age < 12)
			System.out.println("Sorry,Age must be greater than 12 to register as a Adult");
	
	}
	public void requestBook() {
		if(bookType.equals("Fiction")) 
			System.out.println("Book Issued successfully, please return the book within 7 day");
		else 
			System.out.println("Oops, you are allowed to take only Adults Fiction books");
		}
	}
	
  class  LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kid = new KidUsers();
		kid.age=10;
		kid.bookType="Kids";
		kid.registerAccount();
		kid. requestBook();
		kid.age=18;
		kid.bookType="Fiction";
		kid.registerAccount();
		kid.requestBook();
		
		AdultUser adu = new AdultUser();
		adu.age=5;
		adu.bookType="Kids";
	    adu.registerAccount();
	    adu.requestBook();
		adu.age=23;
		adu.bookType="Fiction";
		adu.registerAccount();
		adu.requestBook();
}		
	}

 
