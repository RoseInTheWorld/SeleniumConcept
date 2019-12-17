package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethods {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");
  WebElement dayElement=driver.findElement(By.id("day"));
  WebElement month=driver.findElement(By.id("month"));
  WebElement year=driver.findElement(By.id("year"));
  Select select1=new Select(dayElement);
 // System.out.println(select1.toString());
  System.out.println(select1.isMultiple());
  //interview question
  //how to select element without using selesct class
  
  
	}

}
