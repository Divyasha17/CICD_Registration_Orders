package Module;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Handling_Registration {
	
	
	
	@Test(dataProvider="getData")
	public void doLogin(String name,String DOB,String eMail,String phone_Number,String address)
	{
	   System.out.println("Name : " + name  + " DOB : " + DOB + "EMail : " + eMail + "Phone_Number: " + phone_Number + "Address :" + address) ;	
	}
	
	//@DataProvider run the same test multiple times with different set of data
	@DataProvider
	public  String[][] getData()
	{
		String[][] s=new String[3][5];
		s[0][0]="Bhagya";
		s[0][1]="12315";
		s[0][2]="bhagya@gmail.com";
		s[0][3]="12315456";
		s[0][4]="Chennai";
		
		s[1][0]="Greta";
		s[1][1]="12345";
		s[1][2]="Greta@gmail.com";
		s[1][3]="1231568765";
		s[1][4]="Bangalore";
		
		s[2][0]="shankari";
		s[2][1]="12346";
		s[2][2]="Shankari@gmail.com";
		s[2][3]="1231576765";
		s[2][4]="Pune";
		
		return s;
		
	}
	
 
	/*@Test(dataProvider="getdata")
	public void doReg(String userName,String passWord,String email,int Mobileno)
	{
		System.out.println("Username: " +userName + "Password :  " +passWord
				                +"Email :" +email +"Mobilenumber :"+Mobileno );
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] ob = new Object[4][4];
		ob[0][0]="Divya";
		ob[0][1] ="Divya123";
		ob[0][2] ="Divya@gmail.com";
		ob[0][3] =78;
		
		ob[1][0]="Greta";
		ob[1][1] ="Greta123";
		ob[1][2] ="Greta@outlook.com";
		ob[1][3] =98;
		
		ob[2][0]="Priya";
		ob[2][1] ="Priya123";
		ob[2][2] ="Priya@yahoo.com";
		ob[2][3] =88;
		
		ob[3][0]="Shankari";
		ob[3][1] ="Shankari123";
		ob[3][2] ="Shankari@gmail.com";
		ob[3][3] =97;
		
		return ob;
	}*/
	
	
}
