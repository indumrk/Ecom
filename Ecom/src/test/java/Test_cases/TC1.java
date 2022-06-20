package Test_cases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.Login;
public class TC1 {
	
	
	static WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/macos/Desktop/drivers/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://marketplace-test.ordofy.com:4500/home");
		driver.manage().window().maximize();
		System.out.println("ordofy launched");
		Thread.sleep(10000);
	}
	
	
	@Test
	public void launch() throws InterruptedException {
		Login b = new Login(driver);
		b.Profile_click();
		Thread.sleep(6000);
		b.Send_username();
	
	}
	
	
	
	
	}
	


