package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	public WebDriver driver;
	public GoogleHomePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(className = "gLFyf")
	WebElement searchBar;
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	@FindBy(id = "result-stats")
	WebElement searchResult;
	
	public void enteringProductName(String product_name) {
		searchBar.sendKeys(product_name);
	}
	public void clickingOnSearchButton() {
		searchButton.click();
	}
	public boolean isSearchResultVisible() {
		return searchResult.isDisplayed();
	}


}


