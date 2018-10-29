package POSFrame.POS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Poslandingpage {
	
	@Test
	public void landingpage(){

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotiprava\\Desktop\\Selenium Set up file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.co.in/?gws_rd=ssl");
	}	

}
