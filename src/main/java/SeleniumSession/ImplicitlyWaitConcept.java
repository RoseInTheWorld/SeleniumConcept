package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//implicitly wait:
//this wait tells web driver to wait if the element is not available immediately and
//web driver waits till the element is visible is specific time
//title is not web element it is work only web element
//if could nt find in specific time it will trow an exception no such element exception
//you can only apply to web element other than does not work

		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}

}
