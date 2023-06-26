
public class Test {
	public void doLogin() {
		System.out.println("login Invoked!!");
		System.out.println("login Successful!!");
	}
	
	public void doLogout() {
		System.out.println("Logout Invoked!!");
		System.out.println("Logout Successful!!");
	}

	public static void main(String[] args) {
		
		Test test = new Test();
		test.doLogin();
		test.doLogout();
	}

}
