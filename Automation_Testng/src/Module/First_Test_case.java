package Module;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First_Test_case {

	/*@BeforeMethod //each time run @test precondition before call @beforemethod
	public void preCondition()
	{
		System.out.println("Open Gmail");
	}*/
	
	@BeforeClass
	public void preCondition()
	{
		System.out.println("Open Gmail");
	}
	
	@Test(priority=4)
	public  void loginTest() {
		System.out.println("Login  passed");
	}
	
	
	
	
	/*@AfterMethod //each time run @test postcondition  after call @aftermethod 
	public void postCondition()
	{
		System.out.println("Close Browser");
	}*/
	
	@AfterClass
	public void postCondition()
	{
		System.out.println("Close Browser");
	}
	
	//ignore test use (enabled=false)
	@Test (priority=3)
	public void login_Verification()
	{
		System.out.println("Login  Verified");
	}
	
	
	@Test(priority=2)
	public void successfulllogin()
	{
		System.out.println("Login successfully");
	}
	
	@Test (priority=1)
	public void registration()
	{
		System.out.println("successfully registration");
		String expectedOutput="Welcome";
		String actualOutput="Welcome";	
		
		Assert.assertEquals(expectedOutput,actualOutput);
		
	}
}
