package Module;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Handling_Time_Test {

	
			@Test(dependsOnMethods ="doReg")
			public void doLogin()
			{
				System.out.println("Login successfull");
			}
			
			@Test
			public void doReg()
			{
				String expectedOutput="Welcome";
				String actualOutput="Welcome to india";
				Assert.assertEquals(expectedOutput, actualOutput);
				System.out.println("Registration successfull");	
			}
			
			@Test (enabled=false)
			public void doLogOut()
			{
				System.out.println("LogOut successfull");
			}
}
