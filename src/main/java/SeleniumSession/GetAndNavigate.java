package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.com");
       System.out.println(driver.getTitle());
       driver.navigate().to("http://www.amazon.com");
       //get waits for the page to load fully and completely
       //Navigate will navigate to url and does not wait to load webpage fully and completly
       //navigate you can move back or forword in your session's history
       //navigate is faster than get because it does wait for page load fully
       //Navigate has several methods like forward back and refresh
       
	}

}
