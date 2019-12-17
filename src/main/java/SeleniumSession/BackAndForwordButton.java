package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwordButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver ");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.amazon.com");
		driver.navigate().back();
     //Navigation nav = driver.navigate();
    //nav.back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}
//Get 
	//Navigate
}
