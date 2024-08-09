package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepackage.Deyga_login;

public class Deyga_login_Test 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://deyga.in/account/login");
	}
	@Test
	public void loginTest()
	{
		Deyga_login dl=new Deyga_login(driver);
		dl.setvalues("keerthnaknair98@gmail.com", "abcd@1234");
		dl.loginaccount();
	}

}
