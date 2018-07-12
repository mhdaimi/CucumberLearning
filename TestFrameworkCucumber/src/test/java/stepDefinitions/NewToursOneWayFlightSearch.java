package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectLibrary.Newtours;

public class NewToursOneWayFlightSearch extends Newtours {
	
	@Given("I am on the booking page")
	public void visitBookingPage(){
		login();
	}
	
	@When("I select one way journey")
	public void selectOneWayJourney(){
		WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='oneway']"));
		oCheckBox.click();
	}
	
	@And("source as Frankfurt")
	public void selectSource(){
		driver.findElement(By.name("fromPort")).sendKeys("Frankfurt");
	}
	
	@And("destination as Sydney")
	public void selectDestination(){
		driver.findElement(By.name("toPort")).sendKeys("Sydney");
	}

	@And("click the search button")
	public void clickSearchFlights(){
		driver.findElement(By.name("findFlights")).click();
	}
	
	@Then("I see the list of available flights")
	public void verifyResults(){
		Boolean result = driver.findElement(By.name("results")).isDisplayed();
		//Assert.assertEquals(true, result);
		org.junit.Assert.assertTrue(result);
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}
