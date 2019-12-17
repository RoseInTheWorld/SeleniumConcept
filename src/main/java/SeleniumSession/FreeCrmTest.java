package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCrmTest {

	public static void main(String[] args) {  //command+O will show all the methods javascriptutil
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//driver.get("https://classic.crmpro.com/");
		//driver.get("https://darksky.net/");
		//driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//String title=JavaScriptUtil.getTitleByJS(driver);
		//System.out.println(title);
		//WebElement signUpLink=driver.findElement(By.linkText("Sign up"));
		//JavaScriptUtil.clickElementByJS(singUpLink, driver);
		//JavaScriptUtil.refreshBrowserByJS(driver);
		//JavaScriptUtil.generateAlert(driver,"This is JavaScript Alert Genaration");
		//JavaScriptUtil.drawBorder(signUpLink,driver);
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "ilhan@gmail.com");
		
		driver.get("https://hubspot.com/login");
//		
//		String browserValue=JavaScriptUtil.getBrowserInfo(driver);
//		System.out.println(browserValue);
//		System.out.println(JavaScriptUtil.getPageInnerText(driver));
	WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
	JavaScriptUtil.flash(email, driver);
		email.sendKeys("ilhan@gmail.com");
		JavaScriptUtil.flash(password, driver);
		password.sendKeys("123Test");
		JavaScriptUtil.flash(loginBtn, driver);
	     loginBtn.click();
		//JavaScriptUtil.scrollPageDown(driver);
		
		
	}

}
