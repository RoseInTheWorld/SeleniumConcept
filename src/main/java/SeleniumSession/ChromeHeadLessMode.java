package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadLessMode {

	public static void main(String[] args) {
		//headLess mode 
		//without browser testing
		WebDriverManager.chromedriver().setup();
     
		ChromeOptions co3=new ChromeOptions();
		 WebDriver driver = new ChromeDriver(co3);
      driver.get("https://www.google.com");
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getTitle());
	}

}
