package stepDefinitions;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestGoogleSearch {
	
	WebDriver driver;
	
	@Given("^I am at Google Search home page$")
	public void goToGoogleHomepage(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
	}
	
	@When("^I type Synechron in search text box$")
	public void i_search_for_Synechron() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name(("q"))).sendKeys("Synechron");
	}

	@And("^From the suggestion list select first value$")
	public void from_suggestion_list_select_first_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath((".//*[@class='sbsb_b']/li[1]")));
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		action.click().build().perform();
	}
	
/*	@And("^hit the search button$")
	public void hit_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name(("btnK"))).click();
	}*/

	@Then("^The results are displayed$")
	public void the_results_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@After
	public void closeBrowser(){
		driver.close();
	}

}
