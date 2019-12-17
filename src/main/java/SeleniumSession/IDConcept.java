package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
  Thread.sleep(5000);
  //ID is always unique
  //First Usage
  WebElement userElement=driver.findElement(By.id("username"));
  userElement.sendKeys("ilhanturkmen@hotmail.com");
  //second usage
  driver.findElement(By.id("username")).sendKeys("ilhanturkmen@hotmail.com");
  //Third usage
  By username=By.id("username");
  WebElement userElement1=driver.findElement(username);
  userElement1.sendKeys("third@gamil.com");
  //fourth Usage
 // Util.getElement(driver, "username").sendKeys("ilhan@gamil.com");
  
	}

}
