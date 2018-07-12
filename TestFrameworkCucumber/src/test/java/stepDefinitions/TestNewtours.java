package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectLibrary.Newtours;

public class TestNewtours extends Newtours {
	
	WebDriver driver;
	
	@Given("^I am at homepage of newtours website$")
	public void gotoNewtoursHomepage(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@When("I enter username and password")
	public void enterUserIdAndPassword(DataTable table){
		List<List<String>> data = table.raw();
	    //System.out.println(data.get(1).get(0));
	    //System.out.println(data.get(1).get(1));
		driver.findElement(By.name(("userName"))).sendKeys(data.get(1).get(0));
		driver.findElement(By.name(("password"))).sendKeys(data.get(1).get(1));
	}
	
	@And("click login button")
	public void clickLoginButton(){
		driver.findElement(By.name(("login"))).click();
	}
	
	@Then("I am logged in and booking page is displayed")
	public void verifyLoginAndBookingPage(){
		org.junit.Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}

}
