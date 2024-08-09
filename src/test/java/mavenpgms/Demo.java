package mavenpgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	ChromeDriver driver;
	@Test
	public void setup()
	{
		driver.get("https://www.google.com/");
	}

}
