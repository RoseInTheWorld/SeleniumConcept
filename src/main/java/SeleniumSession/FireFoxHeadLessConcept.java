package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxHeadLessConcept {

	public static void main(String[] args) {
		//why headless mode
		//sometimes jenkings sometimes linuc machine
		//you cannot downloadthe browser
		//in this case you need to use headless mode
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fOptions=new FirefoxOptions();
		fOptions.addArguments("--headless");
		WebDriver driver=new FirefoxDriver(fOptions);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
