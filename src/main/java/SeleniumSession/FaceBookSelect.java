package SeleniumSession;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBookSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
				
				WebDriver driver=new ChromeDriver();

				driver.get("http://www.facebook.com");
				driver.findElement(By.id("u_0_9")).click();
				driver.getTitle();
				}
	}	

