package SeleniumSession;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				driver.manage().window().fullscreen();
	}

}
