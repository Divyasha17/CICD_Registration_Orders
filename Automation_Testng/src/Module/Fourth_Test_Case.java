package Module;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fourth_Test_Case {

	
	
	@Test
	public void registration()
	{
		SoftAssert so =new SoftAssert();
		
		String expectedOutput="Welcome";
		String actualOutput="Welcome to india";	
		so.assertEquals(expectedOutput, actualOutput);
		
		//Assert.assertEquals(expectedOutput,actualOutput);
		//System.out.println("Registration successfull");
	    so.assertAll();	
	    System.out.println("Registration successfull");
	}
	
	@Test
	
	public void doLogin()
	{
		System.out.println("Login successfull");
		//System.out.println("Logout successfull");
	}
	
	
	//hardassertion -- Assert.assertEquals rest of the execution also stop
	//softassertion  -- only in the testng
	
	
	
}
