package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotConcepts {
 static WebDriver driver;
 @BeforeMethod
 public void launchBrowser(){
	 System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.com");
 }
 //tagName
 //array name[   index]
 @Test
 public void takeScreenShot() throws IOException{
	 File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//apache concept
	 FileUtils.copyFile(screenshotFile, new File("/Users/brttuba/Desktop/testPng/picture.png"));//selenium
 }
 @AfterMethod
 public void close(){
	// driver.close();
	 driver.quit();
 }
}
//you test your app sometimes some part will faild in that point you need to show developer screen shot