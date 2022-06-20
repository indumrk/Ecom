package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver1)
	{
		this.driver= driver1;
		
	}

	By Profile = By.xpath("/html/body/app-root/div/app-buyer-routing-layout/div/app-header/div[1]/div[2]/img");
	By Username = By.xpath("/html/body/app-root/div/app-login/div/div[2]/form[1]/input");

			//create user action
	public void Profile_click ()
	{
		
		System.out.println("g000d");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(Profile).click();
		System.out.println("clcik");
	}
	
	
	public void Send_username()
	{
		driver.findElement(Username).sendKeys();
		
		
		
	}
	
	
	
}
