package Module;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Handling_Parameterization {

	
	@Test(dataProvider="getData")
	public void doLogin(String userName,String passWord)
	{
	   System.out.println("UserName : " + userName  + "  "+ " Password : " + passWord);	
	}
	
	//@DataProvider run the same test multiple times with different set of data
	@DataProvider
	public  String[][] getData()
	{
		String[][] s=new String[3][2];
		s[0][0]="Divya";
		s[0][1]="Divya123";
		
		s[1][0]="Greta";
		s[1][1]="Greta123";
		
		s[2][0]="shankari";
		s[2][1]="shankari123";
		
		return s;
		
	}
}
