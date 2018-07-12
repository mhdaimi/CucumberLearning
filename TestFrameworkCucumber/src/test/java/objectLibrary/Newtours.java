package objectLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {
	
	public WebDriver driver;
	public String url = "http://newtours.demoaut.com/";
	
	public void login(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name(("userName"))).sendKeys("batman");
		driver.findElement(By.name(("password"))).sendKeys("batman");
		driver.findElement(By.name(("login"))).click();
		
	}

}
