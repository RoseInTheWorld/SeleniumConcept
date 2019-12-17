package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAllTheLinks {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	List<WebElement>linkList=driver.findElements(By.tagName("a"));
	
	System.out.println("total links:"+linkList.size());
	for(int i=0;i<linkList.size();i++){
		String text=linkList.get(i).getText();
       System.out.println(text);
       linkList.get(i).click();
       Thread.sleep(2000);
       driver.navigate().back();
       
       linkList=driver.findElements(By.tagName("a"));
   	
	}
	}
}
