package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
  Thread.sleep(5000);
  By signUp=By.partialLinkText("Sign");
  Util.getElement(driver, signUp).click();
  
	}

}
