package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
public static WebDriver driver;

static By email=By.id("username");
static By password =By.xpath("//input[@id='password']");
static By loginButton =By.cssSelector("@loginBtn");
static By signUp=By.linkText("Sign up");

	public static void main(String[] args) throws InterruptedException {
		driver=Util.launchBrowser(driver,"chrome");
		Util.launchURL(driver, "https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		System.out.println(Util.getPageTitle(driver));
		Util.getElement(driver, email).sendKeys("ilhanturkmen@hotmail.com");
		Util.getElement(driver, password).sendKeys("Furkan.117675");
		//Util.getElement(driver,loginButton).click();
		Util.getElement(driver, signUp).click();
		
		
	}

}
