
// we code everything here
package steps;

import org.testng.Assert;

import common.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleHomePage;

public class simpleSearch extends TestBase {
	
	
	
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();
		
		}

	@When("i enter the {string}")
	public void i_enter_the(String product_name) {
		
		
		// code to enter the products name
		//WebElement searchBar = driver.findElement(By.className("gLFyf")); //By is an abstract class
		
		// searchBar.sendKeys(product_name); // sendKeys method is used for to enter an input and upload a file in web page
		GoogleHomePage gp = new GoogleHomePage(driver);
	    gp.enteringProductName(product_name);
	}
	

	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.click();
		GoogleHomePage gp = new GoogleHomePage(driver);
		gp.clickingOnSearchButton();
	    
	}

	@Then("i see the related search results successfully")
	public void i_see_the_related_search_results_successfully() {
		
		
		/*WebElement searchResult = driver.findElement(By.id("result-stats"));
		System.out.println("=========================================================================================");
		
		String resultText = searchResult.getText();
		System.out.println(resultText);
		System.out.println("=========================================================================================");
		
		boolean displayResults = searchResult.isDisplayed(); */
		
		GoogleHomePage gp = new GoogleHomePage(driver);
		Assert.assertTrue(gp.isSearchResultVisible(), "Search Result is not displayed");
		
		closeBrowser();
		closeAll();
	    
	}


}
