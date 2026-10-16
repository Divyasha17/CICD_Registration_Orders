package Module;

import org.testng.annotations.Test;

public class Misc {

	@Test(invocationCount=2)
	public void doLogin()
	{
		System.out.println("Login is successfull");
	}
	
	
	
}
