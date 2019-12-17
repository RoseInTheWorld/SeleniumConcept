package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
     WebElement login=driver.findElement(By.id("login1"));
     login.sendKeys("ilhan@gmail.com");
     driver.navigate().refresh();
     login=driver.findElement(By.id("login1"));
     login.sendKeys("ilhan@gmail.com");
     
	}

}
