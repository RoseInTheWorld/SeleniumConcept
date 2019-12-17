package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/login");

		Thread.sleep(5000);
		//First
		WebElement userElement=driver.findElement(By.name("username"));
		userElement.sendKeys("ilhanturkmen@hotmail.com");
		//second usage
		driver.findElement(By.name("username")).sendKeys("ilhanturkmen@hotmail.com");
		
		//third way
//		
//Util
		//Util.getElement(driver, "username");
		
	}

}
