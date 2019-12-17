package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
  Thread.sleep(5000);
  //First
  //form-control private-form__control login-email
  WebElement userElement =driver.findElement(By.className("login-email"));
  userElement.sendKeys("ilhanturkmen@hotmail.com");
  
  //second
  driver.findElement(By.className("login-email")).sendKeys("secondQgmail.com");
 //third
  By username=By.className("login-email");
 // WebElement userElement=driver.findElement(username);
 // userElement.sendKeys("ilhanturkmne@gmail.com");
  //Util
  Util.getElement(driver, username);
  
	}

}
