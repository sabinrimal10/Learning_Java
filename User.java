package constructor;

public class User {
	
	String username;
	String password;
	// default constructor
//	User(){
//		username = "root";
//		password = "123";
//	}
	
	// Parameterized constructor
	User(String username, String password){
		this.username = username;
		this.password = password;
		
		/*
		 * # 'this' keyword represents current object.
		 * 
		 * # we can call
		 * 	-> instance variables
		 * 	-> instance methods
		 * 	-> constructors
		 */
	}
	
	void printUser() {
		System.out.println("Username= "+username);
		System.out.println("Password= "+password);
		
	}
	
	public static void main(String[] args) {
		User u = new User("Alan Rimal", "55555@55");
		u.printUser();
		//u.printUser();
		
	}
}
