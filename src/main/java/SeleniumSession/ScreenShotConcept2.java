package SeleniumSession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotConcept2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();//will be maximize
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		//Take screen shot from web page
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screen shot to desired location using copyFile//method
		FileUtils.copyFile(src,new File("/Users/brttuba/Documents/workspace/SeleniumConcepts/Screenshots/google.png"));

		

	}

}
