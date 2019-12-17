package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynWaitConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();//bonigarcia
		//this method tells web driver to wait if the element is not
		//available immidiately and web driver waits till the element visible in specified time
		//if  not it throws an exceptions like nosuchElement exception
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//implicitly wait will applied an any element
		//You can only webelement other than does not work
		

		driver.get("https://app.hubspot.com/login");
		//static wait it is used to slow down element or threads
		//Thread.sleep(5000);
		//implicitly wait does not work in this case because title is not webelement
System.out.println("Title:"+driver.getTitle());
driver.findElement(By.id("username")).sendKeys("ilhan@hotmail.com");
//thread sleep is not part of the selenium-->java
//it is used to slown down element or thread in web page
	}

}
