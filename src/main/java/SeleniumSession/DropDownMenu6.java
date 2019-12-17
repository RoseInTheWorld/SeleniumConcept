package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu6 {
static WebDriver driver;

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");

		WebElement day= driver.findElement(By.id("day"));
      WebElement month= driver.findElement(By.id("month"));
     WebElement year= driver.findElement(By.id("year"));
     Select select1=new Select(day);
   // System.out.println(select1.isMultiple()); // --it returns true or false==dropdown is multiple or single
    // select1.deselectByIndex(3);
     select1.deselectByVisibleText("day");
     
	}

}
