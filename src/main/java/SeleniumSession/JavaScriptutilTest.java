package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptutilTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
//		String title= JavaScriptUtil.getTitleByJS(driver);
//		System.out.println(title);
//		WebElement element=driver.findElement(By.linkText("Sign up"));
//		JavaScriptUtil.clickElementByJS(element, driver);
       JavaScriptUtil.refreshBrowserByJS(driver);
       //sendKeys()
       //JavaScriptUtil.sendKeys(driver,"username","brttuba91@gmail.com");
       //get browser info
        String text=JavaScriptUtil.getBrowserInfo(driver);
        System.out.println(text);
        //get page text
        JavaScriptUtil.getPageInnerText(driver);
        String textInner=JavaScriptUtil.getPageInnerText(driver);
        System.out.println(textInner);
        //Flash method
      	WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
      	JavaScriptUtil.flash(email, driver);
		email.sendKeys("ilhan@gmail.com");
		JavaScriptUtil.flash(password, driver);
		password.sendKeys("123Test");
		JavaScriptUtil.flash(loginBtn, driver);
	     loginBtn.click();
//scroll  down
   driver.get("https://darksky.net/");     
        
    JavaScriptUtil.scrollPageDown(driver); 
    
    
    //change color
    
    JavaScriptUtil.changeColor("blue", email, driver);
        
	}

}
