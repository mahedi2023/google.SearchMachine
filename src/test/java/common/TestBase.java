
// parent class for all the common methods
package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public WebDriver driver;
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	// to maximize the browser
	driver.manage().window().maximize();
	
	// to code wait time to load the web site fully
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
// create a new method
public void closeBrowser() {
	driver.close();
}

public void closeAll() {
	driver.quit();
}

}
