
public class Test {
	public void doLogin() {
		System.out.println("login Invoked!!");
		System.out.println("login Successful!!");
	}
	
	public void addCustomer() {
		System.out.println("Customer added!!");
	}
	
	public void doLogout() {
		System.out.println("Logout Invoked!!");
		System.out.println("Logout Successful!!");
	}
	
<<<<<<< HEAD
	public void addcart() {
		System.out.println("add cart");
	}
=======
>>>>>>> 555c3374c4793e0a951b729dcdad160ec2bc0005

	public static void main(String[] args) {
		
		Test test = new Test();
		test.doLogin();
		test.doLogout();
	}

}
